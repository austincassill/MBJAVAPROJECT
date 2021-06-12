/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;
import java.util.Scanner;
/**
 *
 * @author arc726
 */
public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a;
        float b;
        
        boolean quit = false;
        // input validation using while loop and switch 
        // test comment
        while (!quit) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add, subtract, divide, multiply, or quit?");
        String action = input.nextLine();
        action = action.toUpperCase();
        
        switch (action) {
            case "ADD":
            System.out.println("Enter the first number: ");
            a = input.nextFloat();
            System.out.println("Enter the second number: ");
            b = input.nextFloat();
            System.out.println("Result: "+add(a,b));
            break;
        
        
            case "SUBTRACT":
            System.out.println("Enter the first number: ");
            a = input.nextFloat();
            System.out.println("Enter the second number: ");
            b = input.nextFloat();
            System.out.println("Result: "+subtract(a,b));
            break;
        
        
            case "DIVIDE":
            System.out.println("Enter the first number: ");
            a = input.nextFloat();
            System.out.println("Enter the second number: ");
            b = input.nextFloat();
            System.out.println("Result: "+divide(a,b));
            break;
        
        
            case "MULTIPLY":
            System.out.println("Enter the first number: ");
            a = input.nextFloat();
            System.out.println("Enter the second number: ");
            b = input.nextFloat();
            System.out.println("Result: "+multiply(a,b));
            break;
            
            case "QUIT":
            System.out.println("Quitting...");
            quit = true; 
            break;
        
            default:
            System.out.println("Oops...try again...");
        
        }
       
    }
        
    }
    
    // add method
    public static float add(float a, float b) {
        return a + b;
    }
    
    // subtract method
    public static float subtract(float a, float b) {
        return a - b;
    }
    
    // divide method
    public static float divide(float a, float b) {
        return a / b;
    }
    
    // TODO: implement the multiply method    
    
}