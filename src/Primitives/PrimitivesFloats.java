package Primitives;

public class PrimitivesFloats {
    protected static float PI;

    public static void main(String[] args) {
        
        float floatNumber = 0.00000000015f; //
        System.out.println("floatNumber = " + floatNumber);

        System.out.println("floatNumber = " + floatNumber);
        System.out.println("float type corresponds to: " + Float.BYTES);
        System.out.println("float type size is: " + Float.SIZE);
        System.out.println("Max value of a float: " + Float.MAX_VALUE);
        System.out.println("Min value of a float: " + Float.MIN_VALUE);

        System.out.println();

        double realDouble = 3;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double type corresponds to: " + Double.BYTES);
        System.out.println("double type size is: " + Double.SIZE);
        System.out.println("Max value of a double: " + Double.MAX_VALUE);
        System.out.println("Min value of a double: " + Double.MIN_VALUE);

        System.out.println();

        System.out.println(PI);

    }
}

