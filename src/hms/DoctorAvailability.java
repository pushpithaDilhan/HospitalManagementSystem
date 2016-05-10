package hms;

/**
 *
 * @author HP
 */
public class DoctorAvailability {
    
    public boolean isAvailable(String code , int date){
        return code.charAt((6*date)+1) == '1'; // 6depends on Sankaja's code
    }
    
}
