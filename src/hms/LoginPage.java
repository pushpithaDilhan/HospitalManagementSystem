package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.*;

/**
 *
 * @author HP
 */
public class LoginPage {
    
    private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

    public ResultSet validate() {
        
        ResultSet result = null;
        try {   
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM login");
            result = state.executeQuery();
            return result;
        } catch (SQLException | NullPointerException ex) {
            if (logger.isInfoEnabled()){
                logger.info("SQL or NullPointer : " + ex);
            }
            return result;
        }
        
        
    }
}
