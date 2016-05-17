package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
/* @author Admin
 */
public class UpdateDoctor {
    
    
    public ResultSet getDoctorsList(int cate){
       ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor WHERE category = '" +cate+ "'");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
    public void update(Date date , String avalability , String docName){
        try {
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT nic FROM doctor WHERE name = '" +docName+ "'");
            ResultSet result = state1.executeQuery();
            String id = null;
            while(result.next()){
                id = result.getString(1);
            }
            Statement stat = ConnectionHandler.conToDB().createStatement();
            stat.executeUpdate("INSERT INTO doctor_attendence(doctor_nic,name ,date,attendence)"
                                +"VALUES ('"+id+"','"+docName+"','"+convert(date)+"','"+avalability+"')");
            
        } catch (SQLException | NullPointerException ex) {}
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    
}
