/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pushpitha
 */
class PatientRecordGUI {

    public PatientRecordGUI() {
    }
    
    public ResultSet getPatientList(){
        ResultSet result = null; 
        try {                                                                     //stringcode not yet added
            PreparedStatement state1 = ConnectionHandler.conToDB().prepareStatement("SELECT * FROM patient");
            result = state1.executeQuery();
            
            } catch (SQLException ex) {}
        return result;
    }
    
}
