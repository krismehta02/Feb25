import java.util.Scanner;

public class A1Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is odd or even:");

        int x = input.nextInt();

        System.out.println(x + (x % 2 == 0 ? " is even" : " is odd"));

        input.close();
    }
}

