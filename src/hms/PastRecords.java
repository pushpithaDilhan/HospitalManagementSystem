package hms;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class PastRecords {
    
    public ResultSet getPastRecords(String paNic){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM past_records  WHERE pa_nic = '" +paNic+ "'");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex) {
        }
        return result;
    }
    
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
    
}
