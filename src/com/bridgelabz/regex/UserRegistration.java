package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserRegistration
{
    /**
     * Method to check given first name is valid or not
     * with minimum characters 3 and ensure first letter is captial
     */
    public void checkFirstName(String name)
    {
        boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("It is valid name");
        }
        else
        {
            System.out.println("It is not a valid name");
        }
    }
    /**
 * Method to check given last name is valid or not
 * with minimum characters 3 and ensure first letter is captial
 */
public void checkLastName(String name)
{
    boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+").matcher(name).matches();
    if(isMatched)
    {
        System.out.println("It is valid name");
    }
    else
    {
        System.out.println("It is not a valid name");
    }
}
    /**
     * Method to check given email is valid or not
     */
    public void isValidEmail(String email)
    {
        boolean isMatched = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$").matcher(email).matches();
        if(isMatched)
        {
            System.out.println("It is valid email");
        }
        else
        {
            System.out.println("invalid email");
        }
    }
    /**
     * Method to check given mobile no. is valid or not
     */
    public void isValidMobileNumber(String name)
    {
        boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("It is valid mobile number");
        }
        else
        {
            System.out.println("It is not a valid mobile number");
        }
    }
    /**
     * Method to check given password has minimum 8 characters
     */
    public void isValidPassword(String name)
    {
        boolean isMatched = Pattern.compile("[0-9a-zA-Z@!+_.-]{8,}").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("It is valid password");
        }
        else
        {
            System.out.println("It is not a valid password");
        }
    }
    /**
     * Method to ensure password have atleast one uppercase letter
     */
    public void checkUpperCase(String name)
    {
        boolean isMatched = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains uppercase letter");
        }
        else
        {
            System.out.println("Enter atleast one uppercase letter");
        }
    }
    /**
     * Method to ensure password have atleast one numeric number
     */
    public void checkNumericNumber(String name)
    {
        boolean isMatched = Pattern.compile("(?=.*[0-9])[0-9a-zA-Z@!+_.]{8,}").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains numeric number");
        }
        else
        {
            System.out.println("Enter atleast one numeric number");
        }
    }
    /**
     * Method to ensure atleast one special character in password
     */
    public void checkSpecialCharacter(String name)
    {
        boolean isMatched = Pattern.compile("(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("Valid ! It contains special character");
        }
        else
        {
            System.out.println("Enter exactly one special character");
        }
    }

}
