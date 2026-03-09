/*

Description:
Create a program that prints a staircase pattern of 5 steps using the # symbol, with each step on a new line.

Acceptance Criteria:
The output displays a staircase with 5 steps, each step having one more # than the previous.
Each step appears on a new line.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
#
##
###
####
#####
*/

public class TheStaircaseChallenge {
    public static void main(String[] args) {

        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("#####");

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

