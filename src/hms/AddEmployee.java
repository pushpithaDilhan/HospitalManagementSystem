package hms;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AddEmployee {
    public void register(String name, 
                         String nic, 
                         String add, 
                         String email, 
                         String mobile,
                         String position,
                         String other,
                         String mstate,
                         String gender,
                         Date bday,
                         Date regday,String pwd){
         
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO employee(name,nic,address,email,position,other,marital_state,gender,"
                                +"gender,date_of_regi,other) "
                                +"VALUES ('"+name+"','"+nic+"','"+add+"','"+email+"','"
                                +mobile+"','"+position+"','"
                                +other+"','"+mstate+"','"+gender+"','"
                                +convert(bday)+"','"+convert(regday)+"','"+pwd+"')");
            
            
            
        } catch (SQLException ex) {}
    }
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
