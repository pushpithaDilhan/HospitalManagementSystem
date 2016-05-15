package hms;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HospitalManagementSystem {
    
    private static JFrame frame;
    
    
    public static void main(String[] args) throws SQLException {
        
        ConnectionHandler.conToDB();
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1366, 768);
        frame.add(new LoginPageGUI());
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setTitle("Co-opearative Hospital Galle");
        frame.setVisible(true);
    }
    
    public static void update(JPanel exist , JPanel add) {
        frame.remove(exist);
        frame.add(add);
        frame.revalidate();
        frame.repaint();
    }
    
}
