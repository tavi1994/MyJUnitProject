package com.qa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

    }



    public static int blackJack(int x, int y){
        if (x > 21 && y > 21){
            return 0;
        }else if (x > 21){
            return y;
        }else if (y > 21) {
            return x;
        }else if(x==y){
                return 0;

        }else if (x > y){
            return x;
        }else{
            return y;
        }

    }

}
