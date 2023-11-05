import javax.swing.*;

public class NumberSystems {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: "));
        System.out.println("number = " + n);

        System.out.println("bin:" + n + " -> " + Integer.toBinaryString(n));
        System.out.println("oct:" + n + " -> " + Integer.toOctalString(n));
        System.out.println("hex:" + n + " -> " + Integer.toHexString(n));

        JOptionPane.showMessageDialog(null, "uwu");

//        int nB = n;
//        System.out.println("nB = " + nB);
//
//        int nO = 0764;
//        System.out.println("nO = " + nO);
//
//        int nH = 0x1f4;
//        System.out.println("nH = " + nH);


    }
}
