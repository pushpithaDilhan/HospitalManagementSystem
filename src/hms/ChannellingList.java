package hms;

import java.util.ArrayList;

/**
 *
 * @author Dasun K
 */
public class ChannellingList extends Document{
    
    private ArrayList<TimeSlot> chaList;
    
    public void addSlot(TimeSlot timeslot){
        chaList.add(timeslot);
    }
    
}
