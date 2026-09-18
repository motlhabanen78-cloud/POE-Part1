package com.mycompany.assignment_1;

/**
 *
 * @author Student
 */

    public class Login {

   
    public boolean checkUserName(String username) {

        return username.contains("_") && username.length() <= 8;
    }

    
    public boolean checkPasswordComplexity(String password) {

        String capital = ".*[A-Z].*";
        String small = ".*[a-z].*";
        String special = ".*[!@#$%^&*(),.?\":{}|<>].*";
        String digit = ".*\\d.*";
        return password.length() >= 8 && password.matches(capital)  && password.matches(small) && password.matches(special) && password.matches(digit);
    }

    
    public boolean checkCellPhoneNumber(String phone) {

        if (phone.length() <= 12 && phone.startsWith("+27")) {

            int fourthDigit = Character.getNumericValue(phone.charAt(3));

            return fourthDigit >= 6 && fourthDigit <= 8;
        }

        return false;
    }

   
    public String registerUser(
            String username,
            String password,
            String phone) {

        if (checkUserName(username)
                && checkPasswordComplexity(password)
                && checkCellPhoneNumber(phone)) {

            return "User is successfully registered";
        }

        return "User registration failed";
    }

 
    public boolean loginUser( String storedUsername,String storedPassword, String enteredUsername, String enteredPassword) {

        return storedUsername.equals(enteredUsername)
                && storedPassword.equals(enteredPassword);
    }

  
    public String returnLoginStatus(
            boolean loginStatus,
            String firstName,
            String lastName) {

        if (loginStatus) {

            return "User" + firstName + " " + lastName  + ", Successfully accessed account.";
        }

        return "Username or password incorrect, please try again.";
    }
}
    

