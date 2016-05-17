package hms;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import org.apache.log4j.*;

public class PastRecords {
    
    private static final Logger logger = Logger.getLogger(PastRecords.class.getName());
    
    public ResultSet getPastRecords(String paNic){
        ResultSet result = null; 
        try {                                                                     
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM past_records  WHERE pa_nic = '" +paNic+ "'");
            result = state1.executeQuery();
        } catch (SQLException | NullPointerException ex){ 
            logger.error("SQL or NullPointer : " + ex);
        }
        return result;
    }
    
    public boolean validateID(JTextField nicTextField , String nic){
        
        if (logger.isDebugEnabled()){
            logger.debug("NIC in validateID : " + nic);
        }
        
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
                    logger.error("NumberFormatException");
                    nicTextField.setForeground(Color.red);
                    return false;
                }
                return true;
            }
    }
    
}
