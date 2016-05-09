
package hms;
//Yoo yoo Nigaa
public class TimeSlotHandler {
    private String doctorName;
    private String date;
    
    public TimeSlotHandler(String doctorName, String date){
        //Search for given doctor and date, better create a method
        this.doctorName=doctorName;
        this.date=date;
        TimeSlotHandlerGUI gui = new TimeSlotHandlerGUI();
        gui.setVisible(true);
        
    }
 
}
