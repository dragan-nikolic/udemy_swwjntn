package com.nikobit;

import org.testng.annotations.DataProvider;

/**
 * Data Provider Test data.
 */
public class TestData {
    
    @DataProvider(name="inputs")
    public Object[][] getData() {
        return new Object[][] {
            {"bmw", "m3"},
            {"audi", "a6"},
            {"benz", "c300"}
        };
    }
}
