package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.*;

/**
 *
 * @author HP
 */
public class CheckAppointments {
    
    private static final Logger logger = Logger.getLogger(CheckAppointments.class.getName());
    
    public ResultSet check(String docId , int day){
        
        if (logger.isDebugEnabled()){
            logger.debug("Doctor ID : " + docId);
            logger.debug("Date : " + day);
        }
        
        ResultSet result = null;
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT "+convertDay(day)+" FROM appointments WHERE doctorid = '"+docId+"'");
            result = state.executeQuery();
            
        } catch (SQLException ex) {
            logger.error("SQL exception in CheckAppointments.check()");
        }
        
        return result;
    }
    
    public String convertDay(int day){
        if(day == 0){
            return "sunday";
        }else if(day == 1){
            return "monday";
        }else if(day == 2){
            return "tuesday";
        }else if(day == 3){
            return "wednesday";
        }else if(day == 4){
            return "thursday";
        }else if(day == 5){
            return "friday";
        }else{
            return "saturday";
        }
    }
    
}
