package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) {
        /*
          It is not possible to divide by 0, so trying
          to do so will return an unchecked exception (AirthmeticException)
        */
        int division;

        /*
          Since we are using the Scanner, the user
          could enter a letter instead of the number,
          generating an unchecked exception (InputMismatchException).
        */
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int num = kb.nextInt();

        try {
            division = 10 / num;
            System.out.println("Your answer! " + division);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("You must enter an integer!" + (e.getMessage()));
        } catch (ArithmeticException e) {
            System.out.println("It is not possible to divide by 0 -> " + (e.getMessage()));
        } finally {
            System.out.println("The execution has ended! 🤭");
        }
    }
}
