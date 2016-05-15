/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class AddDoctor {
    
    
    public void addDoctor(int cat,String bDay,String name,String id,String mobile,String address,String doctorStr) throws SQLException{
        Statement stat = ConnectionHandler.conToDB().createStatement();

            stat.executeUpdate("INSERT INTO doctor(name,birthday,category,telephone,nic,schedule_code) "
                                +"VALUES ('"+name+"','"+bDay+"','"+cat+"','"
                                +Integer.parseInt(mobile)+"','"+id+"','"+doctorStr+"')");
        
    }
    public java.sql.Date convert(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
