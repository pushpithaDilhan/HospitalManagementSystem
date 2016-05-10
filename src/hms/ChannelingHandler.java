package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ChannelingHandler {
    
    public ResultSet getDoctorsList(int date, int cate){
        ResultSet result = null; 
        try {                                                                     //stringcode not yet added
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor WHERE category = '" +cate+ "'");
            result = state1.executeQuery();
            
        } catch (SQLException ex) {
        }
        return result;
    }
    
    
}
