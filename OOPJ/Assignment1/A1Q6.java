import java.util.Scanner;

public class A1Q6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter to check whether it is a vowel or consonant: ");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a consonant.");
        }

        input.close();
    }
}

