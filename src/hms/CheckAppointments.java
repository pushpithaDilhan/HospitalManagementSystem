package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class CheckAppointments {
    
    public ResultSet check(String docId , int day){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT "+convertDay(day)+" FROM appointments WHERE doctorid = '"+docId+"'");
            result = state.executeQuery();
            
        } catch (SQLException ex) {
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
