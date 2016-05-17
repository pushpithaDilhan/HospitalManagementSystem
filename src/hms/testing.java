/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class testing{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
    Class.forName("com.mysql.jdbc.Driver");  
    
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/gallecoop?useSSL=false", "pushpedilhan","gallecoop");
   
        Statement state = con.createStatement();
        String sql  = "UPDATE patient SET other=''" ;//WHERE nic='945540195v'";
        state.executeUpdate(sql);
        con.close();
       
        //testing system date picker 
        System.out.println(LocalDateTime.now().toString().substring(0,16));
        //
       // ResultSet result = state.executeQuery();
       
        /*String textpad = "";
        while(result.next()){
            textpad+=result.getString(1)+"/n";
            textpad+=result.getString(2)+"/n";
            textpad+=result.getString(3)+"/n";
            textpad+=result.getString(4)+"/n";
            textpad+=result.getString(5)+"/n";
            textpad+=result.getString(6)+"/n";
            textpad+=result.getString(7)+"/n";
            textpad+=result.getString(8)+"/n";
            textpad+=result.getString(9)+"/n";
            textpad+=result.getString(10)+"/n";
            textpad+=result.getString(11)+"/n";
        }
        System.out.println(textpad);
                */
       
       
        

    }
}