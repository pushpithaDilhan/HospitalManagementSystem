package hms;

import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddDoctor {
    
    public void addToDoctor(String id,
                            String name,
                            String code,
                            int cate,
                            String mobile,
                            Date bday,
                            String add,
                            String password
        ){
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();
            stat.executeUpdate("INSERT INTO doctor(nic,name,schedule_code,category,telephone,birthday,address) "
                                +"VALUES ('"+id+"','"+name+"','"+code+"','"
                                +cate+"','"+mobile+"','"+convert(bday)+"','"+add+"')");
        }catch (SQLException | NullPointerException ex) {
            System.out.println("Error");
        }
    }
    
    public void addToLogin(String id,
                           String name,
                           String password,
                           String emp
        ){
        
            Security obj = new Security();
            
        try {
            Statement  stat = ConnectionHandler.conToDB().createStatement();
             stat.executeUpdate("INSERT INTO login(employee,name,username,password) "
                                +"VALUES ('"+emp+"','"+name+"','"+obj.hash(id)+"','"+obj.hash(password)+"')");
        } catch (SQLException ex) {
            Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addToPastRecords(String id,
                                 String s0,
                                 String s1,
                                 String s2,
                                 String s3,
                                 String s4,
                                 String s5,
                                 String s6
        ){
        
        try {
            Statement stat = ConnectionHandler.conToDB().createStatement();
            stat.executeUpdate("INSERT INTO appointments(doctorid,sunday,monday,tuesday,wednesday,thursday,friday,saturday)"
                                +"VALUES ('"+id+"','"+s0+"','"+s1+"','"
                                +s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
            
        } catch (SQLException | NullPointerException ex) {
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
    
    public boolean validate(JTextField docNameTxt,
                            JTextField docId,
                            JTextField mobileText,
                            JTextField docAddText,
                            JPasswordField PassField,
                            JPasswordField conPassField,
                            int cate
                            ){
        
        boolean isok = true;
        
        if (PassField.getText().equals("") || conPassField.getText().equals("")) {
            PassField.setBackground(Color.LIGHT_GRAY);
            conPassField.setBackground(Color.LIGHT_GRAY);
            isok = false;
        }
        if (!PassField.getText().equals(conPassField.getText())) {
            PassField.setForeground(Color.RED);
            conPassField.setForeground(Color.RED);
            isok = false;
        }
        if (docNameTxt.getText().equals("")) {
            docNameTxt.setBackground(Color.LIGHT_GRAY);
            isok = false;
        }
        if (docId.getText().equals("")) {
            docId.setBackground(Color.LIGHT_GRAY);
            isok = false;
        }
        if (mobileText.getText().equals("")) {
            mobileText.setBackground(Color.LIGHT_GRAY);
            isok = false;
        }
        if (docAddText.getText().equals("")) {
            docAddText.setBackground(Color.LIGHT_GRAY);
            isok = false;
        }
        if (!validateID(docId, docId.getText().toLowerCase()) && !docId.getText().equals("")) {
            isok = false;
        }
        if (!validateMobile(mobileText, mobileText.getText()) && !mobileText.getText().equals("")) {
            isok = false;
        }
        if (cate == -1) {
            JOptionPane.showMessageDialog(null, "Please Select Category.");
            isok = false;
        }
        return isok;
    }

    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
