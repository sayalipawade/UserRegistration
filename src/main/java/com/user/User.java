package com.user;

import java.util.Scanner;

public class User
{
    //constants
    public static String NAMEPATTERN="^[A-Z][a-zA-Z]{2,}$";
    //Pattern checking method
    public static void patternChecking(String inputPattern,String validPattern)
    {
        if(inputPattern.matches(validPattern))
        {
            System.out.println("Valid pattern");
        }
        else
        {
            System.out.println("Not valid pattern");
        }
    }
    public static void main(String[] args)
    {
        //variables
        String firstName="";
        System.out.println("Welcome to user registration");
        Scanner sc=new Scanner(System.in);
        //Checking First name is valid or not
        System.out.println("Enter first name:");
        firstName=sc.next();
        patternChecking(firstName,NAMEPATTERN);
    }
}
