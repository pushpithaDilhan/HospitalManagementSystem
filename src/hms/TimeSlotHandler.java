package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import org.apache.log4j.*;

public class TimeSlotHandler {

    private static final Logger logger = Logger.getLogger(TimeSlotHandler.class.getName());

    private static String detail;
    private static String remTimeSlots;
    private static String newTime;
    private static String docNic;
    private static int day;

    public String getTimeSlot(String docName, int day) {
        String startTime = null;
        TimeSlotHandler.day = day;
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT nic,schedule_code FROM doctor WHERE name = '" + docName + "'");
            ResultSet result = state.executeQuery();
            while (result.next()) {
                startTime = result.getString(2).substring(6 * day + 2, 6 * day + 6);
                docNic = result.getString(1);

            }
        } catch (SQLException ex) {
            logger.error("SQL exception");
        }

        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM appointments WHERE doctorid = '" + docNic + "'");
            ResultSet result = state.executeQuery();

            while (result.next()) {
                String temp = result.getString(day + 2);
                if (temp.substring(0, 2).equals("00")) {
                    return null;
                } else if (temp.length() == 2) {
                    remTimeSlots = temp.substring(0, 2);
                    newTime = startTime;
                    return startTime + temp;
                } else {
                    detail = temp.substring(2);
                    remTimeSlots = temp.substring(0, 2);
                }
            }
            newTime = convertTime(detail.substring(detail.length() - 4));

            if (logger.isDebugEnabled()) {
                logger.debug("Converted time : " + newTime);
            }

            return newTime + remTimeSlots;//Time of latest time Slot and no of remaining time slots.

        } catch (SQLException ex) {

            logger.error("SQL exception");
            return null;
        }
    }

    public void updateTimeSlot(String patientNic) {

        if (logger.isDebugEnabled()) {
            logger.debug("Patient nic : " + patientNic);
        }

        try {
            String newReTiSlots = String.valueOf(Integer.parseInt(remTimeSlots) - 1);

            if (newReTiSlots.length() != 2) {
                newReTiSlots = "0" + newReTiSlots;
            }
            if (detail == null) {
                detail = newReTiSlots + patientNic + newTime;
            } else {
                detail = newReTiSlots + detail.substring(2) + patientNic + newTime;
            }

            if (logger.isDebugEnabled()) {
                logger.debug("detail : " + detail);
            }

            Statement stat = ConnectionHandler.conToDB().createStatement();
            stat.executeUpdate("UPDATE appointments SET " + convertDay(day).toLowerCase() + " = '" + detail + "' WHERE doctorid = '" + docNic + "'");
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Channelling Failed.");
            logger.error("SQL or NullPointer : " + ex);
        }

    }

    public String convertTime(String time) {
        
        if (logger.isDebugEnabled()){
            logger.debug("Time : " + time);
        }
        
        String Time = LocalTime.parse(time.substring(0, 2) + ":" + time.substring(2)).plusMinutes(10).toString();
        return Time.substring(0, 2) + Time.substring(3);
    }

    public String convertDay(int day) {
        if (day == 0) {
            return "SUNDAY";
        } else if (day == 1) {
            return "MONDAY";
        } else if (day == 2) {
            return "TUESDAY";
        } else if (day == 3) {
            return "WEDNESDAY";
        } else if (day == 4) {
            return "THURSDAY";
        } else if (day == 5) {
            return "FRIDAY";
        } else {
            return "SATURDAY";
        }
    }

}
