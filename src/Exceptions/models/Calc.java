package Exceptions.models;
public class Calc {
    public static double division(int a, int b) throws ByZeroException {
        if(b == 0) {
            throw new ByZeroException("It is not possible to divide by zero ");
        }
        return a / (double) b;
    }

    public static double division (String a, String b) throws IncorrectFormatException, ByZeroException {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return Calc.division(x, y);
        } catch (NumberFormatException e) {
            throw new IncorrectFormatException("Enter a integer!");
        }
    }
}
