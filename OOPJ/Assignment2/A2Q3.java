import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer to calculate the sum of its digits:");
        
        int num = input.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;  
            num = num / 10;   
        }

        System.out.println("Sum of the digits: " + sum);
    }
}

