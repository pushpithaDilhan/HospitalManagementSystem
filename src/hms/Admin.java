
package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.*;

public class Admin {
    
    private static final Logger logger = Logger.getLogger(Admin.class.getName());
    
    public ResultSet viewDoctorDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM doctor");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
            logger.error("SQL or NullPointer in Admin.viewDocDetails()");
        }
        return result;
    }
    
    public ResultSet viewPatientDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM patient");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
            logger.error("SQL or NullPointer in Admin.viewPatientDetails()");
        }
        return result;
    
    }
    public ResultSet viewEmployeeDetails(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM employee");
            result = state.executeQuery();
            
        } catch (SQLException | NullPointerException ex) {
            logger.error("SQL or NullPointer in Admin.viewEmployeeDetails()");
        }
        return result;
    }
    
}
