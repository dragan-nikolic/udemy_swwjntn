package com.nikobit;

import org.testng.annotations.*;
import static org.junit.Assert.*;

/**
 * Data Providers Example.
 */
public class DataProvidersTest {
    
    @Test(dataProvider="inputs", dataProviderClass=TestData.class)
    public void testMethod1(String input1, String input2) {
        System.out.println("Input 1: " + input1);
        System.out.println("Input 2: " + input2);
        assertTrue(true);
    }
}
