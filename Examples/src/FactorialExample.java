import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int number = input.nextInt();

        int result = 1; // Start From 1; because if we start from 0 the result always 0

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
