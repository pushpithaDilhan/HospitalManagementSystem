/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.util.ArrayList;


/**
 *
 * @author Pushpitha
 */
public class Pharmacy {
    private ArrayList<Drug> drug;
    private Hospital hospital;
    
    public Pharmacy(Hospital hospital){
        this.hospital = hospital;
    }
    
    public void addPharmasict(Person person){
        hospital.addEmployee(person);
    }
        
    
}
