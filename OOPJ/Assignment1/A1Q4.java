public class A1Q4 {
    public static void main(String[] args) {
        int x = 22;

        Integer OBJX = Integer.valueOf(x);
        double OBJY = OBJX.doubleValue();

        double Z = 25.25;
        Double OBJZ = Double.valueOf(Z);
        int a = OBJZ.intValue();

        System.out.println("int : " + x + " to Double is : " + OBJY);
        System.out.println("Double value : " + Z + " to int is : " + a);
    }
}

