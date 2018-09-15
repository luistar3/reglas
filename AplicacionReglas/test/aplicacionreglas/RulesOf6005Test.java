/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionreglas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class RulesOf6005Test {
    
    public RulesOf6005Test() {
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

    /**
     * Test of mayUseCodeInAssignment method, of class RulesOf6005.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        
       
        assertEquals(false, RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertEquals(true, RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        assertEquals(false, RulesOf6005.mayUseCodeInAssignment(false, false, false, false, false));
         assertEquals(false, RulesOf6005.mayUseCodeInAssignment(true, true, true, true, true));
      
        
    }

    /**
     * Test of main method, of class RulesOf6005.
     */
    
    
}
