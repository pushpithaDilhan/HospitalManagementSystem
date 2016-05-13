
package hms;
//Admin

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RemoveDoctor {
    
    public String searchAvailability(String id)throws SQLException{
        ResultSet result = null; 
        try {
            PreparedStatement state = ConnectionHandler.conToDB().prepareStatement("SELECT name FROM doctor WHERE nic = '" +id+ "'");
            result = state.executeQuery();
            return result.toString();
        } catch (Exception e) {
            infoBox("Database connection!",e.toString());
            return null;
        }
    }
    
    public void removeDoctor(String id){
        try{
        Statement stat = ConnectionHandler.conToDB().createStatement();
        stat.executeUpdate("DELETE FROM doctor WHERE nic ="+id+"LIMIT 1");
        }catch(SQLException e){
            infoBox("Database connection!",e.toString());
        }
        
    }
     public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
