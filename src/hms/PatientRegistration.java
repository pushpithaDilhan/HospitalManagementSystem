package hms;

import java.util.Date;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.*;

/**
 * @author HP
 */
public class PatientRegistration {
    
    private static final Logger logger = Logger.getLogger(PatientRegistration.class.getName());
    
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
        
        if (logger.isDebugEnabled()){
            logger.debug("Patient name : " + name);
            logger.debug("Patient nic : " + nic);
            logger.debug("Patient mobile : " + mobile);
        }
         
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO patient(name,birthday,address,email,mobile,city,nic,pic,"
                                +"gender,marital_state,date_of_regi,other) "
                                +"VALUES ('"+name+"','"+convert(bday)+"','"+add+"','"+email+"','"
                                +mobile+"','"+city+"','"
                                +nic+"','"+pic+"','"+gender+"','"
                                +mstate+"','"+convert(regday)+"','"+other+"')");
            
            /*PreparedStatement state = new ConnectionHandler().getConnect().prepareStatement("SELECT name FROM doctor WHERE category = '" +cate+ "'");
            ResultSet result = state.executeQuery();*/
            
        } catch (SQLException ex) {
            logger.error("SQL exception");
        }
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

}
