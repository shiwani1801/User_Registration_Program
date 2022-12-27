package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistrationMain
{
        public static void main(String args[])
        {
            System.out.println("Welcome to User Registration Problem");
            Scanner scanner = new Scanner(System.in);

            /**UC1
             * Check first name
             */
            System.out.println("Enter your first name: ");
            String firstName = scanner.next();
            UserRegistration obj1 = new UserRegistration();
            obj1.checkFirstName(firstName);

            /**UC2
             * Check last name
             */
            System.out.println("Enter your last name: ");
            String lastName = scanner.next();
            UserRegistration obj2 = new UserRegistration();
            obj2.checkLastName(lastName);

            /**UC3
             * Check email is valid or not
             */
            System.out.println("Enter your Email: ");
            String email = scanner.next();
            UserRegistration obj3 = new UserRegistration();
            obj3.isValidEmail(email);

            /**UC4
             * Check mobile number is valid or not
             */
            System.out.println("Enter your mobile number: ");
            String mobileNumber = scanner.next();
            UserRegistration obj4 = new UserRegistration();
            obj4.isValidMobileNumber(mobileNumber);

            /**UC5
             * Check password with 8 characters
             */
            System.out.println("Enter password: ");
            String password = scanner.next();
            UserRegistration obj5 = new UserRegistration();
            obj5.checkCharacters(password);

            /**UC6
             * Check password contains atleast upper case or not
             */
            obj5.checkUpperCase(password);

            /**UC7
             * Check password has atleast one numeric number
             */
            obj5.checkNumericNumber(password);
            /**UC8
             * Check password has atleast one special character or not
             */
            obj5.checkSpecialCharacter(password);
            /**
             * UC9
             * Check entered password is valid or not using above rules
             */
            obj5.isValidPassword(password);
        }
}
