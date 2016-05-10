package hms;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author HP
 */
public class PatientRegistration {
    
    public void register(String name, 
                         String nic, 
                         String pic, 
                         String add, 
                         String email, 
                         String mobile, 
                         String city,
                         String other,
                         String mstate,
                         String gender,
                         Date bday,
                         Date regday){
         
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO patient(name,birthday,address,email,mobile,city,nic,pic,"
                                +"gender,marital_state,date_of_regi,other) "
                                +"VALUES ('"+name+"','"+convert(bday)+"','"+add+"','"+email+"','"
                                +Integer.parseInt(mobile)+"','"+city+"','"
                                +nic+"','"+Integer.parseInt(pic)+"','"+gender+"','"
                                +mstate+"','"+convert(regday)+"','"+other+"')");
            
            /*PreparedStatement state = new ConnectionHandler().getConnect().prepareStatement("SELECT name FROM doctor WHERE category = '" +cate+ "'");
            ResultSet result = state.executeQuery();*/
            
        } catch (SQLException ex) {}
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

}
