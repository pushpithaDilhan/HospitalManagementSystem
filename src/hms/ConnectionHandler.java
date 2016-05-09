package hms;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JButton;

public class ConnectionHandler {
    
    private static Connection con;
    private static boolean breakCon;
    
    public void createDBCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {}
        try {
            con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/gallecoop?useSSL=false", "pushpedilhan","gallecoop");
            breakCon = false;
        } catch (SQLException ex) {}
    }
    
    public Connection getDBCon(){
        return con;
    }
    
    public boolean isDisconnected(){
        return breakCon;
    }
    
    public boolean isConnected(){
        boolean status = false;
        Socket sock = new Socket();
        InetSocketAddress address = new InetSocketAddress("www.google.com", 80);
        try {
            sock.connect(address, 3000);
            if (sock.isConnected()) {
                status = true;
            }
        } catch (Exception e) {
            breakCon = true;
        } finally {
            try {
                sock.close();
            } catch (Exception e) {
            }
        }
        return status;
    }
    
    public void updateConnection(JButton btn){
        if (isConnected()!= true) {
            btn.setVisible(true);
        } else {
            btn.setVisible(false);
        }
        
    }
    
}
