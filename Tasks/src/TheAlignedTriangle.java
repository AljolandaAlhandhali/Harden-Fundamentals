/*
Description:
Write a program that prints a right-aligned triangle of asterisks, with 5 rows, using spaces for alignment.

Acceptance Criteria:
The output displays a right-aligned triangle with 5 rows.
Each row contains the correct number of spaces and stars.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.
Expected Input/Output:
Output:
    *
   **
  ***
 ****
*****
*/

public class TheAlignedTriangle {
    public static void main(String[] args) {
        System.out.print("    *\n");
        System.out.print("   **\n");
        System.out.print("  ***\n");
        System.out.print(" ****\n");
        System.out.print("*****\n");

        System.out.println();

        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
