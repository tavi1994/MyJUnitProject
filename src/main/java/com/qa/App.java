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
        App app = new App();

        System.out.println(app.returnNumber(number1,number2));
        System.out.println(app.returnSum(number1,number2));
        sc.close();
    }



    public int returnNumber(int number1,int number2){
        return number1;
    }

    public int returnSum(int number1, int number2){
        return number1+number2;
    }
}
