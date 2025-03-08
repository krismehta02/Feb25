mport java.util.Scanner;

public class A2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        String result = (x > y && x > z) ? x + " is the greatest" : 
                        (y > z) ? y + " is the greatest" : 
                        z + " is the greatest";

        System.out.println(result);
        input.close();
    }
}
