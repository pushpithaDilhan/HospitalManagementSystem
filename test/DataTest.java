/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import hms.ConnectionHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pushpitha
 */
public class DataTest {
    
    public DataTest() {
    }
    
    @Test
    public void test() throws SQLException{
        Connection con = (Connection) ConnectionHandler.conToDB();
        PreparedStatement state = (PreparedStatement) con.prepareStatement("select nic from patient where nic='942156385V'");
       
        // Resultset takes the data as a iterable array
        ResultSet result = state.executeQuery();
        String ths = result.getString(1);
        System.out.println(ths.equals("942156385V"));
        assertEquals("942156385V","942156385V");
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
