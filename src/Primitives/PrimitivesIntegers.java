package Primitives;

public class PrimitivesIntegers {
    public static void main(String[] args) {
        byte byteNumber = 127;

        System.out.println("byteNumber = " + byteNumber);
        System.out.println("Byte type corresponds to: " + Byte.BYTES);
        System.out.println("Byte type size is: " + Byte.SIZE);
        System.out.println("Max value of a Byte: " + Byte.MAX_VALUE);
        System.out.println("Min value of a Byte: " + Byte.MIN_VALUE);

        System.out.println();

        short shortNumber = 32767;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("Short type corresponds to: " + Short.BYTES);
        System.out.println("Short type size is: " + Short.SIZE);
        System.out.println("Max value of a Short: " + Short.MAX_VALUE);
        System.out.println("Min value of a Short: " + Short.MIN_VALUE);

        System.out.println();

        int intNumber = 2147483647;
        System.out.println("intNumber = " + intNumber);
        System.out.println("Integer type corresponds to: " + Integer.BYTES);
        System.out.println("Integer type size is: " + Integer.SIZE);
        System.out.println("Max value of a Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of a Integer: " + Integer.MIN_VALUE);

        System.out.println();

        long longNumber = 9223372036854775807L;
        System.out.println("longNumber = " + longNumber);
        System.out.println("long type corresponds to: " + Long.BYTES);
        System.out.println("long type size is: " + Long.SIZE);
        System.out.println("Max value of a long: " + Long.MAX_VALUE);
        System.out.println("Min value of a long: " + Long.MIN_VALUE);
    }
}
