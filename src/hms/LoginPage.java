package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class LoginPage {
    
    public String validate(String userName, String password){
        String employee = null;
        try {
            ConnectionHandler chObj = new ConnectionHandler();
            if (chObj.isDisconnected()) {
                chObj.createDBCon();
            }
            PreparedStatement state = chObj.getDBCon().prepareStatement("SELECT * FROM login");
            ResultSet result = state.executeQuery();
            while(result.next()){
                if(result.getString(1).equals(userName) && result.getString(2).equals(password)){
                    employee = result.getString(3);
                    break;
                }
            }
        } catch (SQLException ex) {}
        return employee;
    }
}
