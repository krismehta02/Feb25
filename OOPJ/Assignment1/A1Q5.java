public class A1Q5 {
    public static void main(String[] args) {

        int x = 20;
        int y = 30;

        System.out.println("Value of X and Y before swapping using 3rd variable: " + x + " and " + y);

        int z = x;
        x = y;
        y = z;

        System.out.println("Value of X and Y after swapping using 3rd variable: " + x + " and " + y);

        x = 20;
        y = 30;

        System.out.println("Value of X and Y before swapping without using 3rd variable: " + x + " and " + y);

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("Value of X and Y after swapping without using 3rd variable: " + x + " and " + y);
    }
}

