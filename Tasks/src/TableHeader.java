/*
Description:
Create a program that prints a formatted multiplication table header for numbers 1-10, including lines and tab-separated numbers.

Acceptance Criteria:
The output displays a multiplication table header with numbers 1-10 separated by tabs.
The header is framed by lines above and below.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
========================================
	MULTIPLICATION TABLE
========================================
1	2	3	4	5	6	7	8	9	10
----------------------------------------
*/

public class TableHeader {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("\tMULTIPLICATION TABLE");
        System.out.println("========================================");
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        System.out.println("----------------------------------------");
    }
}
