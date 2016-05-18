package hms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.apache.log4j.*;

public class HospitalManagementSystem {
    
    private static final Logger logger = Logger.getLogger(HospitalManagementSystem.class.getName());
    
    private static JFrame frame;
    
    public static void main(String[] args) {
        
        if (logger.isTraceEnabled()){
            logger.trace("First log inside HMS.main");
        }
        
        ConnectionHandler.conToDB();
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1366, 768);
        frame.add(new HRStaffInterface());                  // change this to get the ui.

        frame.setTitle("Cooperative Hospital Galle");
        
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public static void update(JPanel exist , JPanel add) {
        
        if (logger.isInfoEnabled()){
            logger.info("Inside HMS.update()");
        }
        frame.remove(exist);
        frame.add(add);
        frame.revalidate();
        frame.repaint();
    }
    
}
