package Exceptions;

import javax.swing.*;

import Exceptions.models.ByZeroException;
import Exceptions.models.Calc;
import Exceptions.models.IncorrectFormatException;

public class App {
    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Enter a number 🤨");

        int num;
        double division;

        try {
            num = Integer.parseInt(value);
            division  = Calc.division("10", value); // use 'num' or 'value'
            System.out.println("Your answer! " + division);
            System.out.println();
        } catch (NumberFormatException | IncorrectFormatException e) {
            System.out.println("You must enter an integer!" + (e.getMessage()));
            e.printStackTrace(System.out);
        } catch (ByZeroException e) {
            System.out.println("It is not possible to divide by 0 -> " + (e.getMessage()));
        } finally {
            System.out.println("The execution has ended! 🤭");
        }
    }
}
