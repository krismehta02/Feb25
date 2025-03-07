import java.util.Scanner;

public class A2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to check whether it is odd or even:");
        
        int x = input.nextInt();
        
        System.out.println((x & 1) == 0 ? x + " is even" : x + " is odd");
    }
}

