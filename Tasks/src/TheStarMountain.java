/*
Description:
Write a program that prints a pyramid pattern of 5 rows using asterisks, centered with spaces.

Acceptance Criteria:
The output displays a pyramid with 5 rows, each row centered and increasing in stars.
The pattern matches the provided example.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
    *
   ***
  *****
 *******
*********
*/
//        System.out.println("    *");
//        System.out.println("   ***");
//        System.out.println("  *****");
//        System.out.println(" *******");
//        System.out.println("*********");
//
//        System.out.println();
public class TheStarMountain {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= (2 * i -1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
