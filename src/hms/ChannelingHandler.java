package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ChannelingHandler {
    
    public ResultSet getDoctorsList(int cate){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name,schedule_code FROM doctor WHERE category = '" +cate+ "'");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
}
