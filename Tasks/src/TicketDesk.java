import java.util.ArrayList;
import java.util.Scanner;

public class TicketDesk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner to read user input

        // ArrayLists to store ticket data - All lists share same index for one ticket
        ArrayList<String> ticketNumbers = new ArrayList<>();
        ArrayList<String> ticketDescriptions  = new ArrayList<>();
        ArrayList<String> ticketPriorities  = new ArrayList<>();

        String[] priorities = {"LOW", "MEDIUM", "HIGH"}; // Priority Array
        boolean mainMenuRunning = true; // Controls main menu loop

        // ================= MAIN MENU =================
        while (mainMenuRunning) {
            System.out.println("### Main Menu ###");
            System.out.print("Please Select Option:\n1. Customer Operations\n2. Admin Operations\n3. Exit\nEnter your choice: ");
            int userChoice = Integer.parseInt(input.nextLine());

            // ================= CUSTOMER MENU =================

            if (userChoice == 1) {
                boolean customerMenuRunning = true; // Controls customer Menu
                while (customerMenuRunning) {
                    System.out.print("\n=== Customer Operations ===\n1. Create Ticket\n2. Back to Main Menu\n3. Exit\nEnter your choice: ");
                    int customerChoice = Integer.parseInt(input.nextLine());

                    // -------- CREATE TICKET --------
                    if (customerChoice == 1) {
                        System.out.println();
                        System.out.print("Enter Ticket Number: ");
                        String ticketNumber = input.nextLine();
                        System.out.print("Enter Description: ");
                        String description = input.nextLine();
                        System.out.print("Select Priority:\n1. Low 2. Medium 3. High \nEnter Your Choice: ");
                        int priorityChoice = Integer.parseInt(input.nextLine());
                        String selectedPriority; // Stores selected ticket priority
                        if (priorityChoice == 1) {
                            selectedPriority = priorities[0];
                        }
                        else if (priorityChoice == 3) {
                            selectedPriority = priorities[2];
                        }
                        else {
                            selectedPriority = priorities[1]; // default = MEDIUM
                        }
                        // Store ticket data
                        ticketNumbers.add(ticketNumber);
                        ticketDescriptions.add(description);
                        ticketPriorities.add(selectedPriority);
                        System.out.println("Ticket Created successfully!");
                    }
                    // -------- Back to main menu --------
                    else if (customerChoice == 2) {
                        customerMenuRunning = false;
                        System.out.println();
                    }

                    // -------- Exit program --------
                    else if (customerChoice == 3) {
                        System.out.println("Exiting the application. Goodbye!");
                        mainMenuRunning = false;
                        customerMenuRunning = false;
                    }
                    else {
                        System.out.println("Invalid choice!");
                    }
                }
            }

            // ================= ADMIN MENU =================
            else if (userChoice == 2) {
                System.out.println();
                System.out.print("Enter Admin PIN: ");
                int adminPin = Integer.parseInt(input.nextLine());

                if (adminPin == 12345) {
                    boolean adminMenuRunning = true; // Controls admin Menu
                    while (adminMenuRunning) {
                        System.out.print("\n=== Admin Operations ===\n1. View Ticket\n2. Update Ticket\n3. Back to Main Menu\n4. Exit\nEnter your choice: ");
                        int adminChoice = Integer.parseInt(input.nextLine());

                        // -------- VIEW TICKET --------
                        if (adminChoice == 1) {
                            System.out.println();
                            System.out.print("Enter Ticket Number: ");
                            String searchNumber = input.nextLine();
                            int index = ticketNumbers.indexOf(searchNumber);
                            // Check if ticket exists (indexOf returns -1 if not found)
                            if (index != -1) {
                                System.out.println("Ticket Number: " + ticketNumbers.get(index)
                                        + ", Description: " + ticketDescriptions.get(index)
                                        + ", Priority: " + ticketPriorities.get(index));
                            }
                            else {
                                System.out.println("Ticket not found!");
                            }
                        }

                        // -------- UPDATE TICKET --------
                        else if (adminChoice == 2) {
                            System.out.println();
                            System.out.print("Enter Ticket Number: ");
                            String searchNumber = input.nextLine();
                            int index = ticketNumbers.indexOf(searchNumber);
                            // Check if ticket exists (indexOf returns -1 if not found)
                            if (index != -1) {
                                System.out.print("Enter New Description: ");
                                String newDescription = input.nextLine();
                                ticketDescriptions.set(index, newDescription);
                                System.out.println("Ticket updated successfully!");
                            }
                            else {
                                System.out.println("Ticket not found!");
                            }
                        }

                        // -------- Back to main menu --------
                        else if (adminChoice == 3) {
                            adminMenuRunning = false;
                            System.out.println();
                        }

                        // -------- Exit program --------
                        else if (adminChoice == 4) {
                            System.out.println("Exiting the application. Goodbye!");
                            mainMenuRunning = false;
                            adminMenuRunning = false;
                        }
                        else {
                            System.out.println("Invalid choice!");
                        }
                    }
                }

                else {
                    System.out.println("Incorrect PIN!");
                    System.out.println();
                }
            }

            // ================= EXIT =================
            else if (userChoice == 3) {
                System.out.println("Exiting the application. Goodbye!");
                mainMenuRunning = false;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
