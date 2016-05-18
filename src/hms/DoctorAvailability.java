package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.apache.log4j.*;

/**
 *
 * @author HP
 */
public class DoctorAvailability {
    
    private static final Logger logger = Logger.getLogger(DoctorAvailability.class.getName());
    
    public ResultSet getDoctorList(Date date){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor_attendence WHERE Date = '" +convert(date)
                                        + "' AND attendence = '1' ");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
            logger.error("SQL or NullPointer " + ex);
        }
        return result;
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
}
