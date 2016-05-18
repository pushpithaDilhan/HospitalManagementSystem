package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;


public class ChannelingHandler {
    
    private static final Logger logger = Logger.getLogger(ChannelingHandler.class.getName());
    
    public ResultSet getDoctorsList(int cate){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name,schedule_code FROM doctor WHERE category = '" +cate+ "'");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
            logger.error("SQL or NullPointer in ChannellingHandler.getDocList()");
        }
        
        return result;
    }
}
