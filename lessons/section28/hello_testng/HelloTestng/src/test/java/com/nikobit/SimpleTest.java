/*
example from https://testng.org/doc/index.html
*/

package com.nikobit;

import org.testng.annotations.*;
 
public class SimpleTest {
 
    @BeforeClass
    public void setUp() {
        System.out.println("*** setUp Suite ***");
    }
    
    @BeforeMethod
    public void setUpMethod() {
        System.out.println("*** setUp Test ***");
    }
    
    @AfterClass
    public void tearDown() {
        System.out.println("*** tearDown Suite ***");
    }
    
    @AfterMethod
    public void tearDownMethod() {
        System.out.println("*** tearDown Test ***");
    }
    
    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("*** Fast test ***");
    }
    
    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("*** Slow test ***");
    } 
}
