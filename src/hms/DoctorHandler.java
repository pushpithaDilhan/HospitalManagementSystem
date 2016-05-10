package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DoctorHandler {
    
    public ResultSet getDoctorsList(int date, int cate){
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor WHERE category = '" +cate+ "'");
            result = state.executeQuery();
            
        } catch (SQLException ex) {
        }
        return result;
    }
    
    
}
