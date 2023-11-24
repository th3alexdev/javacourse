package Overloading;

public class CalcApp {
    public static void main(String[] args) {
        System.out.println("int + int -> " + (Calc.addition(2, 5)));
        System.out.println("int + int + int -> " + (Calc.addition(2, 5, 3)));
        System.out.println("float + int -> " + (Calc.addition(3.1999f, 2)));
        System.out.println("double + double + int -> " + (Calc.addition(5L, 4L, 5)));
        System.out.println("String + String -> " + (Calc.addition("9", "5")));
        System.out.println("String + String -> " + (Calc.addition("1", "#")));
        System.out.println("... args -> " + (Calc.adittion(5, 3, 4, 99, 7, 8, -5, 12)));
    }
}
