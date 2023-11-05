import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner scanKeyboard = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = 0;
        
        try {
            number = scanKeyboard.nextInt();

            String binary = Integer.toBinaryString(number);
            String oct = Integer.toOctalString(number);
            String hex = Integer.toHexString(number);

            System.out.println("binary = " + binary);
            System.out.println("oct = " + oct);
            System.out.println("hex = " + hex);

        } catch (InputMismatchException e) {
            System.out.println(e);
            main(args);
            System.exit(0);
        }
    }
}
