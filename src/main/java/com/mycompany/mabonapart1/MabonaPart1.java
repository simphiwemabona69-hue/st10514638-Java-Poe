/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mabonapart1;
import java.util.Scanner;

/**
 *
 * @author Student
 */

public class MabonaPart1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Login user = new Login();
           
        //Ask the user to enter name
        System.out.print("Enter your First Name: ");
        user.setFirstName(scanner.nextLine());

        //Ask user to enter last name
        System.out.print("Enter your Last Name: ");
        user.setLastName(scanner.nextLine());

        // Keep asking for details until registration requirements are met
        boolean registrationSuccessful = false;
        
        while (!registrationSuccessful) {
            System.out.print("Enter Username: ");
            user.setUsername(scanner.nextLine());

            System.out.print("Enter Password: ");
            user.setPassword(scanner.nextLine());

            System.out.print("Enter Cell Phone Number: ");
            user.setCellPhoneNumber(scanner.nextLine());

            // Check if details are valid
            String registrationMessage = user.registerUser();
            System.out.println("\n" + registrationMessage);

            // Check if registration succeeded
            if (registrationMessage.contains("registered successfully")) {
                registrationSuccessful = true;
            } else {
                System.out.println("Please try entering your registration details again.");
            }
        }



        System.out.print("Enter your Username to log in: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your Password to log in: ");
        String enteredPassword = scanner.nextLine();

        // Check if entered details match registered details
        boolean isLoggedIn = user.loginUser(enteredUsername, enteredPassword);

        // Display outcome message
        String loginMessage = user.returnLoginStatus(isLoggedIn);
        System.out.println("\n" + loginMessage);

        scanner.close();
    }
}