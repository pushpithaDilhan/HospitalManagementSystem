
package hms;

import java.util.Dictionary;

/*@author Admin*/
public class Pharmasicst extends Person{
    private Dictionary prescriptionList;
    
    public Pharmasicst(String nic, int age, String name) {
        super(nic, age, name);
    }

    public Dictionary getPrescriptionList() {
        return prescriptionList;
    }
    
    public void updatePrescriptionList(int key,Prescription prescription){
        this.prescriptionList.put(key, prescription);    
    }
    
}
