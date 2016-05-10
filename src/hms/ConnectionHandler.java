package hms;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JButton;

public class ConnectionHandler {
    
    
    private static Connection con;
    private static boolean breakCon = true;
    
    private ConnectionHandler(){ //Use Singleton design pattern to make sure that unique Connection object will create.
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {}
        try {
            con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/gallecoop?useSSL=false", "pushpedilhan","gallecoop");
            System.out.println("new DB");
            breakCon = false;
        } catch (SQLException ex) {}
    }
    
    public static Connection conToDB(){// return/create Connection object.
        isConnected();
        if (con == null && breakCon) {
            new ConnectionHandler();
        }
        return con;
    }
    
    public static boolean isConnected(){ //check availability of the  internet connection.
        boolean status = false;
        Socket sock = new Socket();
        InetSocketAddress address = new InetSocketAddress("www.google.com", 80);
        try {
            sock.connect(address, 3000);
            if (sock.isConnected()) {
                status = true;
            }
        } catch (Exception e) {
            con = null;
            breakCon = true;
        } finally {
            try {
                sock.close();
            } catch (Exception e) {
            }
        }
        return status;
    }
    
    public static void updateConnection(JButton btn){//update wifibutton with cueeent state of the internet connection.
        if (isConnected()!= true) {
            btn.setVisible(true);
        } else {
            btn.setVisible(false);
        }
        
    }
    
}
