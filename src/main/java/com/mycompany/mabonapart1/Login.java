/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mabonapart1;

/**
 *
 * @author Student
 */
public class Login {
    
    // Instance variables to store user details
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;

    // Default Constructor
    public Login() {
    }

    /**
     * Checks if username has an underscore '_' and is 5 or fewer characters.
     */
    public boolean checkUserName() {
        if (username != null && username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if password meets all rules:
     * - Minimum 8 characters long
     * - Contains a capital letter
     * - Contains a number
     * - Contains a special character
     */
    public boolean checkPasswordComplexity() {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasCapital = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Loop through each character in the password string
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasCapital = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return hasCapital && hasDigit && hasSpecial;
    }

    /**
     * Beginner-friendly cell phone number check.
     * Checks if it starts with '+' and is 10 or fewer characters total.
     */
    public boolean checkCellPhoneNumber() {
        if (cellPhoneNumber == null || cellPhoneNumber.isEmpty()) {
            return false;
        }

        // Code Attribution: Simple String prefix and length check
        boolean startsWithPlus = cellPhoneNumber.startsWith("+");
        boolean isShortEnough = cellPhoneNumber.length() <= 12;

        return startsWithPlus && isShortEnough;
    }

    /**
     * Evaluates all conditions and returns the exact assignment message.
     */
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }

        return "The two above conditions have been met, and the user has been registered successfully.";
    }

    /**
     * Verifies if entered credentials match registered details.
     */
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        if (enteredUsername != null && enteredPassword != null) {
            return enteredUsername.equals(this.username) && enteredPassword.equals(this.password);
        }
        return false;
    }

    /**
     * Returns login outcome message.
     */
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    // --- Getters and Setters ---

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
    
