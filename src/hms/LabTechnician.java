package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LabTechnician {
    
    static String[] selectedTimeSlots = null;


    public int getDateDifference(Date selectedDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateWithoutTime = null;                                        // To get the Date with time set to 00.00

        try {
            dateWithoutTime = sdf.parse(sdf.format(new Date()));            // This will return today's date. We can give this the date of the lab testing start, when we deploy.
        } catch (ParseException ex) {
        }

        // null pointer if the date is not chosen.           
        long diff = selectedDate.getTime() - dateWithoutTime.getTime();
        int dateDifference = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return dateDifference;
    }

    public void selectTimeDuration(int testIndex) {
        
        String[] oneHourTimeSlots = {"08.00-09.00", "09.00-10.00", "10.00-11.00", "11.00-12.00", "13.00-14.00", "14.00-15.00", "15.00-16.00"};
        String[] twoHourTimeSlots = {"08.00-10.00", "10.00-12.00", "13.00-15.00", "15.00-17.00"};

        if (testIndex == 0 | testIndex == 2 | testIndex == 4) {                 // change according to the time taken.
            selectedTimeSlots = oneHourTimeSlots;
        } else {
            selectedTimeSlots = twoHourTimeSlots;
        }
    }

    public ResultSet viewPatientList(int cate) {                                // have the option to give the relevant date too.
        ResultSet result = null;
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM labslots WHERE category = ?");        // not * ---- may be nic
            state.setInt(1, cate);
            result = state.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }

}
