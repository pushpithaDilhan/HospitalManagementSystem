package hms;

import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JTextField;

public class AddRecords {
    
    public boolean validateID(JTextField nicTextField , String nic){
            if (nic.length() != 10) {
                nicTextField.setForeground(Color.red);
                return false;
            }else if(nic.charAt(9) != 'v'){
                nicTextField.setForeground(Color.red);
                return false;
            }else {
                try {
                    Integer.parseInt(nic.substring(0,9));
                } catch (java.lang.NumberFormatException ex) {
                    nicTextField.setForeground(Color.red);
                    return false;
                }
                return true;
            }
    }
    
    public void addRecords(String paName, 
                           String paNic, 
                           String docNic,
                           Date date,
                           String med,
                           String des){
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO past_records(pa_nic,doc_nic,pa_name,date,medicine,description)"
                                +"VALUES ('"+paNic+"','"+docNic+"','"+paName+"','"+convert(date)+"','"
                                +med+"','"+des+"')");
            
        } catch (SQLException | NullPointerException ex) {}
    }
    
    
    
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
