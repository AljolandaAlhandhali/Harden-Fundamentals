import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter a number to display its multiplication table: ");
        int num = sc.nextInt(); // read user input

        // Multiplication table
        System.out.println("**** Multiplication table of " + num + " ****");
        System.out.println("---> Without Loop:");

        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

        System.out.println();

        System.out.println("---> With Loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println();

        System.out.println("**** Multiplication table from 1 to " + num + " ****");
        for (int i = 1; i <= num; i++) {
            System.out.println("---> Multiplication table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // blank line between tables
        }
    }
}