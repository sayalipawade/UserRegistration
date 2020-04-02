package com.user;

import java.util.Scanner;

public class User
{
    //constants
    public static String NAMEPATTERN="^[A-Z][a-zA-Z]{2,}$";
    public static String EMAILPATTERN="^[a-zA-Z0-9]{3,}+[@][a-zA-Z0-9]{3,}+[.][a-zA-Z]{3,}$";
    public static String MOBILEPATTERN="^[0-9]{2}[0-9]{10}";
    public static String PASSWORDPATTERN="^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[0-9a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
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
        String mobileNo="";
        String password="";
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

        //checking mobile no is valid or not
        System.out.println("Enter Mobile No:");
        mobileNo=sc.next();
        patternChecking(mobileNo,MOBILEPATTERN);

        //Password should contain at least one uppercase character
        System.out.println("Enter Password");
        password=sc.next();
        patternChecking(password,PASSWORDPATTERN);

    }
}
