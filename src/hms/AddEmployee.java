/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class AddEmployee {
    public void register(String name,String nic,Date bDay,String mobile,String address,String pos,String other,String mStatus,Date regDay,String gender){
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();
            stat.executeUpdate("INSERT INTO employee VALUES ('1','"+nic +"','"+name+"','"+convert(bDay) +"','"+mobile+"','"+address +"','" + pos+"','"+other+"','"+mStatus+"','"+convert(regDay)+"','"+ gender +"')");
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
                } catch (java.lang.NumberFormatException | StringIndexOutOfBoundsException ex) {
                    nicTextField.setForeground(Color.red);
                    return false;
                }
                return true;
            }
    }
    
    public boolean validateMobile(JTextField nicTextField , String mobile){
            if (mobile.length() != 10 && mobile.length() != 0) {
                nicTextField.setForeground(Color.red);
                return false;
            }else {
                try {
                    Integer.parseInt(mobile);
                } catch (java.lang.NumberFormatException | StringIndexOutOfBoundsException ex) {
                    nicTextField.setForeground(Color.red);
                    return false;
                }
                return true;
            }
    }
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
