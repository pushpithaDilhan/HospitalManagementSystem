package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author HP
 */
public class DoctorAvailability {
    
    public ResultSet getDoctorList(Date date){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor_attendence WHERE Date = '" +convert(date)
                                        + "' AND attendence = '1' ");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
}
