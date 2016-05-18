package hms;

import java.sql.SQLException;
import java.sql.Statement;

/* @author Admin
 */
public class AddServiceCharges {
    

    public void addService(String name,String price){
        try {
            System.out.print("addSertvice");
            Statement stat = ConnectionHandler.conToDB().createStatement();
            //Logger
            //int n = stat.executeUpdate("SELECT COUNT(*) FROM charges");
            //System.out.print(n);
            //String serviceNum = "S0"+(n+1)+"";
            stat.executeUpdate("INSERT INTO charges VALUES ('"+"S1"+"','"+name+"','"+price+"')");
        }catch (SQLException e) {
            //Logger
            
        }
    }
}
