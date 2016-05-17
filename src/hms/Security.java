package hms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.log4j.*;


/**
 *
 * @author Pushpitha
 */
public class Security {
    
    private static final Logger logger = Logger.getLogger(Security.class.getName());
    
    public String hash(String s){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
        } catch (NoSuchAlgorithmException ex) {
            logger.error("NoSuchAlgorithm exception");
        }
        
        
        byte byteData[] = md.digest();//convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
    
}
