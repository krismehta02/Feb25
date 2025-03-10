import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        if ((a && b) || (a && c) || (b && c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();
    }
}


