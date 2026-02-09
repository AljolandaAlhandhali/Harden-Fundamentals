import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TecketNumber {
    public static void main(String[] args) throws InterruptedException {
        // Declaration
        Scanner inputBufferObj = new Scanner(System.in);
        int noOfTicketsToProcess = 3;
        int currentTicketNumber = 1;

        while (currentTicketNumber <= noOfTicketsToProcess) {
            // Input
            System.out.print("Please enter your ticket number to check status: ");
            String ticketNumber = inputBufferObj.nextLine(); // Collection of characters
            //    System.out.println("Please enter your ticket number to check status: ");
            //    String ticketNumberTwo = inputBufferObj.nextLine(); // Collection of characters
            //    System.out.println("Please enter your ticket number to check status: ");
            //    String ticketNumberThree = inputBufferObj.nextLine(); // Collection of characters

            // Process
            String dummyStatus = "Pending";

            // Output
            System.out.printf("The complain status of ticket %s is: %s\n", ticketNumber, dummyStatus);
            //    System.out.printf("The complain status of ticket %s is: %s\n", ticketNumberTwo, dummyStatus);
            //    System.out.printf("The complain status of ticket %s is: %s\n", ticketNumberThree, dummyStatus);

            currentTicketNumber = currentTicketNumber + 1;
        }
        System.out.println("Ending the Execution!");
    }
}
