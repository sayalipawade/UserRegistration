package com.user;

import java.util.Scanner;

public class User
{
    //constants
    public static String NAMEPATTERN="^[A-Z][a-zA-Z]{2,}$";
    public static String EMAILPATTERN="^[a-zA-Z0-9]{3,}+[@][a-zA-Z0-9]{3,}+[.][a-zA-Z]{3,}$";
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
        String lastName="";
        String email="";
        System.out.println("Welcome to user registration");
        Scanner sc=new Scanner(System.in);

        //Checking First name is valid or not
        System.out.println("Enter first name:");
        firstName=sc.next();
        patternChecking(firstName,NAMEPATTERN);

        //Checking last name is valid or not
        System.out.println("Enter last name:");
        lastName=sc.next();
        patternChecking(lastName,NAMEPATTERN);

        //Checking email is valid or not
        System.out.println("Enter email address:");
        email=sc.next();
        patternChecking(email,EMAILPATTERN);
    }
}
