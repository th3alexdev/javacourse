package Overloading;

public class Calc {

    private Calc() {}

    public static int addition(int a, int b) { // int + int
        return a + b;
    }

    public static int addition(int a, int b, int c) { // int + int + int
        return a + b + c;
    }

    public static float addition(float a, int b) { // float + int
        return a + b;
    }

    public static double addition(double x, double y, int z) { // double + double + int
        return x + y + z;
    }

    public static int addition(String a, String b) { // String + String
        int result;

        try {
            result = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            result = 0;
        }

        return result;
    }

    public static int adittion(int... args) {
        int total = 0;
        for (int i: args) {
            total += i;
        }

        return total;
    }
}
