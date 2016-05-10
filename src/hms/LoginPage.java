package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class LoginPage {
    
    public String validate(String userName, String password){
        String employee = null;
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM login");
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
