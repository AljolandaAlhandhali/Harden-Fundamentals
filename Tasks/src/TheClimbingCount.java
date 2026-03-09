/*
Description:
Write a program that prints numbers in a ladder format, where each row adds one more number, separated by tabs.

Acceptance Criteria:
The output displays numbers in a ladder, with each row starting from 1 and ending at the row number.
Numbers are separated by tabs.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
1
1	2
1	2	3
1	2	3	4
1	2	3	4	5
*/

public class TheClimbingCount {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1\t2");
        System.out.println("1\t2\t3");
        System.out.println("1\t2\t3\t4");
        System.out.println("1\t2\t3\t4\t5");

        System.out.println();

        for (int i = 1; i <= 5; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(j + "\t");
           }
            System.out.println();
        }
    }
}
