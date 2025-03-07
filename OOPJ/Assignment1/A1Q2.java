import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        System.out.println("Addition of given numbers: " + (num1 + num2));
        System.out.println("Subtraction of given numbers: " + (num1 - num2));
        System.out.println("Product of given numbers: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division of given numbers: " + (num1 / num2));
            System.out.println("Remainder of given numbers: " + (num1 % num2));
        } else {
            System.out.println("Division or remainder by zero is not possible.");
        }

        input.close();
    }
}
