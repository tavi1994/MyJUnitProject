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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int number1 = sc.nextInt();

        System.out.println("Enter second number");
        int number2= sc.nextInt();

        System.out.println(returnNumber(number1,number2));
        }



    public static int returnNumber(int number1,int number2){
        return number1;
    }
}
