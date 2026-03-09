import java.util.ArrayList;
import java.util.Scanner;

public class customerFeedback {
    public static void main(String[] args) {
        /*
        // Declare
        Scanner inputBufferObj = new Scanner(System.in);
        String[] customerFeedbacks = new String[50];
        int currentFeedbackCount = 0;
        boolean mainMenuRunning = true;

        // Initialization
        for (int currentFeedbackIndex = 0; currentFeedbackIndex < customerFeedbacks.length; currentFeedbackIndex++) {
            // Iteration
            customerFeedbacks[currentFeedbackIndex] = "";
        }

        // Input
        while (mainMenuRunning) {
            System.out.print("Please select [1] Feedback or [2] Dashboard or [3] Shutdown: ");
            int userChoice = Integer.parseInt(inputBufferObj.nextLine());

            if (userChoice == 1) {
                System.out.println("I have select Feedback");
                System.out.print("Please enter your comment: ");
                customerFeedbacks[currentFeedbackCount] = inputBufferObj.nextLine();
                currentFeedbackCount++;
            }

            else if (userChoice == 2) {
                System.out.println("I have select Dashboard");
                System.out.print("Please enter your PIN: ");
                int adminPin = Integer.parseInt(inputBufferObj.nextLine());
                if (adminPin == 2468) {
                    System.out.println("Admin PIN is Correct!");
                    for (int currentFeedbackIndex = 0; currentFeedbackIndex < customerFeedbacks.length; currentFeedbackIndex++) {
                        // Iteration
                        System.out.printf("The value of box %d is: %s%n", currentFeedbackIndex, customerFeedbacks[currentFeedbackIndex]);
                    }
                }
                else {
                    System.out.println("Admin PIN is Incorrect!");
                }
            }
            else if (userChoice == 3) {
                System.out.println("The Program is Exit ..");
                mainMenuRunning = false;
            }
            else {
                System.out.println("Are you out of your mind? Select 1 or 2 or 3");
            }
        }
         */


        // Declare
        Scanner inputBufferObj = new Scanner(System.in);
        ArrayList<String> customerFeedbacks = new ArrayList<>();
        boolean mainMenuRunning = true;

        // Input
        while (mainMenuRunning) {
            System.out.print("Please select [1] Feedback or [2] Dashboard or [3] Shutdown: ");
            int userChoice = Integer.parseInt(inputBufferObj.nextLine());

            if (userChoice == 1) {
                System.out.println("I have select Feedback");
                System.out.print("Please enter your comment: ");
                customerFeedbacks.add(inputBufferObj.nextLine());
            }

            else if (userChoice == 2) {
                System.out.println("I have select Dashboard");
                System.out.print("Please enter your PIN: ");
                int adminPin = Integer.parseInt(inputBufferObj.nextLine());
                if (adminPin == 2468) {
                    System.out.println("Admin PIN is Correct!");
                    for (String currentFeedback : customerFeedbacks) {
                        // Iteration
                        System.out.printf("The Feedback is: %s%n", currentFeedback);
                    }
                }
                else {
                    System.out.println("Admin PIN is Incorrect!");
                }
            }
            else if (userChoice == 3) {
                System.out.println("The Program is Exit ..");
                mainMenuRunning = false;
            }
            else {
                System.out.println("Are you out of your mind? Select 1 or 2 or 3");
            }
        }
    }
}
