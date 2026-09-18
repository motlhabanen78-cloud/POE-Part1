/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment_1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ASSIGNMENT_1 {

    public static void main(String[] args) {
     Login log = new Login(); 
    Scanner scanner = new Scanner(System.in); 
        System.out.println("====Registration===");
    
    System.out.print("Enter Username:");
    String Username = scanner.nextLine();
    
    System.out.print("Enter First Name:");
    String FirstName = scanner.nextLine();
    
    System.out.print("Enter Last Name:");
    String LastName = scanner.nextLine();
   
    System.out.print("Enter Password:");
    String Password = scanner.nextLine();

    System.out.print("Enter South African CellNumber:");
    String CellNumber = scanner.nextLine();

    log.registerUser(Username,Password, CellNumber);
    }
}
