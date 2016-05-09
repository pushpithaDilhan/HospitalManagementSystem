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
public class Hospital {
    private ArrayList<Person> employeeList;
    
    public void addEmployee(Person person){
        employeeList.add(person);
    }
    
    
}
