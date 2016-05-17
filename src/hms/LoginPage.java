package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class LoginPage {

    public ResultSet validate() {
        
        ResultSet result = null;
        try {   
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM login");
            result = state.executeQuery();
            return result;
        } catch (SQLException | NullPointerException ex) {
            return result;
        }
        
        
    }
}
