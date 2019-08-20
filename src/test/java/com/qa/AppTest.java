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
      //  assertEquals("Are you returning the right number?", 1, app.returnNumber(1,2));
    }

    @Test
    public void returningRightSum(){

        assertEquals("Are you returning the right sum?", 5, app.blackJack(5,2));
        assertEquals("Are you returning the right sum?", 21, app.blackJack(5,21));
        assertEquals("Are you returning the right sum?", 2, app.blackJack(22,2));
        assertEquals("Are you returning the right sum?", 0, app.blackJack(5,5));
        


    }
}
