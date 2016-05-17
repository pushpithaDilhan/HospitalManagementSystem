package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.*;


public class ServiceCharge {
    
    private static final Logger logger = Logger.getLogger(ServiceCharge.class.getName());
    
    public ResultSet getServiceCharges(){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT service,cost FROM chargers");
            result = state.executeQuery();
            
        } catch (SQLException ex) {
            logger.error("SQLexception");
        }
        return result;
    }
    
    
}
