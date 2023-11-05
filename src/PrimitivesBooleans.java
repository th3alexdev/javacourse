public class PrimitivesBooleans {
    public static void main(String[] args) {
        double d = 98765.43e-3; // 98.76543
        float f = 1.2345e2f; // 123.45

        System.out.println("d = " + d);
        System.out.println("f = " + f);

        boolean isHigher = d < f;
        System.out.println("isHigher = " + isHigher);

        boolean isEqual = 3 - 2 == 1;
        System.out.println("isEqual = " + isEqual);
    }
}
