// import java.util.*;
import java.util.Scanner;

public class customer {
    public static void main(String[] args) {

        // Declare
        Scanner scanner = new Scanner(System.in);
        String[] customerFeedbacks = new String[5];


        // Ask the user to enter 5 Comments
        for (int customerInput = 0; customerInput < 5; customerInput++) {
            System.out.print("Please Enter Your Comment: ");
            customerFeedbacks[customerInput] = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Here are All Feedbacks: ");

        // Print all Feedbacks
        for (int customerInput = 0; customerInput < 5; customerInput++) {
            System.out.println("Response number " + (customerInput + 1) + " is " + customerFeedbacks[customerInput]);
        }
    }
}
