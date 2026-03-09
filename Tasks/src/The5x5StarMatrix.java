/*
Description:
Write a program that prints a 5x5 grid of asterisks, with each row and column separated by spaces.

Acceptance Criteria:
The output displays a 5x5 grid of asterisks, each separated by a space.
The grid matches the provided example.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/



public class The5x5StarMatrix {
    public static void main(String[] args) {

        System.out.println("* * * * *\n* * * * *\n* * * * *\n* * * * *\n* * * * *");

        System.out.println();

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
