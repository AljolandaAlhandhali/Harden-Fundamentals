/*
Description:
Write a program that prints a formatted store receipt, using tabs and lines for structure.

Acceptance Criteria:
The output displays a receipt with a header, itemized list, and total, using tabs and lines.
Formatting matches the provided example.
No loops are required for this problem.
Solution can be written using multiple print statements if needed.

Expected Input/Output:
Output:
========================================
	STORE RECEIPT
========================================
Item		Price
----------------------------------------
Apple		$1.50
Banana		$0.75
Orange		$2.00
----------------------------------------
Total:		$4.25
========================================
*/

public class TheTabbedBill {
    public static void main(String[] args) {
        System.out.print("========================================\n");
        System.out.print("\tSTORE RECEIPT\n");
        System.out.print("========================================\n");
        System.out.print("Item\t\tPrice\n");
        System.out.print("----------------------------------------\n");
        System.out.print("Apple\t\t$1.50\n");
        System.out.print("Banana\t\t$0.75\n");
        System.out.print("Orange\t\t$2.00\n");
        System.out.print("----------------------------------------\n");
        System.out.print("Total:\t\t$4.25\n");
        System.out.print("========================================\n");
    }
}