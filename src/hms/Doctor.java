
package hms;

import java.util.ArrayList;

public class Doctor extends Person{
    
    ArrayList<Pharmasicst> availablePharmacists = new ArrayList<Pharmasicst>();
    ArrayList<Patient> patientList = new ArrayList<Patient>();
    
    public Doctor(String nic, int age, String name) {
        super(nic, age, name);
    }
    
    public void setPharmacist(Pharmasicst pharmacist){
        this.availablePharmacists.add(pharmacist);
    }
    
    public void removePharmacist(Pharmasicst pharmacist){
        this.availablePharmacists.remove(pharmacist);
    }
    
    public void getDetails(PatientDetails pdetails,String patientID){
        
    }
    
    public void setCharges(){
        
    }
    
    public void getAppointments(){
        
    }
    
    public void viewDrug(){
        
    }
}
