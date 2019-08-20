package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private App app;

    @Before
    public void initialise(){
        app = new App();
    }


    @Test
    public void mainTest(){
        String[] input = new String[]{"a"};
        app.main(input);
    }
    /**
     * Rigorous Test :-)
     */

    @Test
    public void areYouReturningRightNumber()
    {
        assertEquals("Are you returning the right number?", 1, app.returnNumber(1,2));
    }

    @Test
    public void returningRightSum(){

        assertEquals("Are you returning the right sum?", 4, app.returnSum(2,2));
    }
}
