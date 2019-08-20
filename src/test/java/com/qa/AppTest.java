package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private App app;


    @Test
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"a"};
        app.main(input);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void areYouReturningRightNumber()
    {
        int number1=1;
        int number2=2;

        assertEquals("Are you returning the right number?", 1, App.returnNumber(number1,number2));

    }

    @Test
    public void returningRightSum(){
        int number1 = 2;
        int number2 = 2;

        assertEquals("Are you returning the right sum?", 4, App.returnSum(number1,number2));

    }
}
