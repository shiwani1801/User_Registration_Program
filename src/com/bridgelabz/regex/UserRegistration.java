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

}
