import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {

        System.out.println("Small program that add two numbers and display the result");

        // INPUT
        Scanner inputBuffeObj = new Scanner(System.in); // Scanner object

        System.out.print("Enter first number: "); // Ask user to enter first number
        int num1 = inputBuffeObj.nextInt(); // Read first number

        System.out.print("Enter second number: "); // Ask user to enter second number
        int num2 = inputBuffeObj.nextInt(); // Read second number

        // PROCESS
        int sum = num1 + num2; // Add the two numbers

        // OUTPUT
        System.out.printf("Sum of %d + %d  = %d", num1, num2, sum); // Display the result
    }
}