package day8.discussion;

import java.util.Scanner;

public class LoginProgram {

    //User Login Program
    public static void main(String[] args) {

        //Predefined username and password (hardcoded for demo purpose)
        String username = "admin";
        String password = "admin123";

        // Create Scanner object to accept input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: "); //Ask user for username
        String LoginUsername = input.nextLine(); // Read user input and stores it to LoginUsername variable
        System.out.print("Enter password: "); //Ask user for password
        String LoginPassword = input.nextLine(); // Read user input and stores it to LoginPassword variable

        // Check if both username and password match the predefined values
        if (LoginUsername.equals(username) && LoginPassword.equals(password)) {
            System.out.println("Login Successful" + "Welcome" + username);
        } else {
            System.out.println("Invalid Username or Password");
        }
        
        //close the scanner
        input.close();
    }
}
