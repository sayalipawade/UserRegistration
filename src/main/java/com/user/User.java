package com.user;
import java.util.Scanner;
public class User implements PatternMatch
{
    //constants
    public static String NAMEPATTERN="^[A-Z][a-zA-Z]{2,}$";
    public static String EMAILPATTERN="^[a-zA-Z0-9]{1,}([.]?[a-zA-Z0-9]{1,})?[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]?[a-z]{2,3})?$";
    public static String MOBILEPATTERN="^[0-9]{2}[0-9]{10}";
    public static String PASSWORDPATTERN="^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[0-9a-z])(?=.*[A-Z])(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

    //variables
    public static String firstName="";
    public static String lastName="";
    public static String email="";
    public static String mobile="";
    public static String password="";

    @Override
    public void patternChecking(String inputPattern, String validPattern)     //method to checks the pattern is valid or not
    {
        if(inputPattern.matches(validPattern))
        {
            System.out.println("Valid Pattern");
        }
        else
        {
            System.out.println("Not valid pattern");
        }
    }
    public static void main(String args[])                     //main method
    {
        PatternMatch p1=new User();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First name:");               //checking first name is valid or not
        firstName=sc.next();
        p1.patternChecking(firstName,NAMEPATTERN);

        System.out.println("Enter last name:");                //checking last name is valid or not
        lastName=sc.next();
        p1.patternChecking(lastName,NAMEPATTERN);

        System.out.println("Enter Email:");                    //checking email is valid or not
        email=sc.next();
        p1.patternChecking(email,EMAILPATTERN);

        System.out.println("Enter Mobile no:");                 //checking mobile no is valid or not
        mobile=sc.next();
        p1.patternChecking(mobile,MOBILEPATTERN);

        System.out.println("Enter password:");                  //checking password is valid or not
        password=sc.next();
        p1.patternChecking(password,PASSWORDPATTERN);
    }
}
