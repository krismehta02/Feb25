public class A2Q1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        
        System.out.println("Before swapping: " + x + " " + y);
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println("After swapping: " + x + " " + y);
    }
}

