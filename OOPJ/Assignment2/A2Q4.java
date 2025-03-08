import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it is divisible by 3:");
        int num = input.nextInt();
        
        while (num >= 3) {
            num = num - 3;
        }
        
        if (num == 0) {
            System.out.println("The number is divisible by 3.");
        } else {
            System.out.println("The number is not divisible by 3.");
        }
    }
}

