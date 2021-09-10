/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyetest;

import java.util.Scanner;

public class EyeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        
        System.out.println("Welcome To Eye Clinic");
    
        
        System.out.println("Please Enter Customer Information:");
        
        System.out.println("Enter ID: ");
    
        int id = ac.nextInt();
        
        System.out.println("Enter Name: ");
        
        String name = sc.nextLine();
        
        System.out.println("Enter Address: ");
        
        String address = sc.nextLine();
        
        System.out.println("Enter Prescription For Right Eye: ");
        
        String presRight = ssc.nextLine();
        
        
        System.out.println("Enter Prescription For Left Eye: ");
        
        String presLeft = ssc.nextLine();
        
        
        Patient patient = new Patient(id, name, address, presLeft, presRight);
        
        System.out.println("Now Select Frame..");
        System.out.println("Available Frame Shapes Are:...");
        
        System.out.println("1. Circle");
        
        System.out.println("2. Square");
        
        System.out.println("3. Rectangle");
        
        System.out.println("4. Oval");
        
        System.out.println("5. Hexagon");
        
        System.out.println("Enter Shape Name");
        String choice = ssc.nextLine();
        
        Frames_Shapes frame = new Frames_Shapes(choice);
        
        System.out.println("Thank You!");
        
        System.out.println("Your Entered:");
        System.out.println("Patient Information: ");
        
        System.out.println("ID: "+patient.getId());
        System.out.println("Name: "+patient.getName());
        System.out.println("Address: "+patient.getAddress());
        System.out.println("Prescription: ");
        
        System.out.println("For Right Eye: "+patient.PrescriptionRightEye());
        
        System.out.println("For Left Eye: "+patient.PrescriptionLeftEye());
        System.out.println("Frame Shape: "+frame.Frames());
        
    }
    
}
