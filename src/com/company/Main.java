package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        //method to find factorial of given number
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("factorial of num 6 ");
        num = keyboard.nextInt();


                int num1 = 5;
                System.out.println("factorial of "+ num1 +" is " + factorial(5));

            }

    public static int factorial(int n) {
        if (n == 0)
        return 1;
        return n * factorial(n - 1);
    }
        }



