public class PrimitivesChars {
    public static void main(String[] args) {
        char character = '\u0040';
        var decimal = 64;

        System.out.println("character = " + character);
        System.out.println("(decimal == character) = " + decimal);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("char type corresponds to: " + Character.BYTES);
        System.out.println("char type size is: " + Character.SIZE);
        System.out.println("Max value of a char: " + Character.MAX_VALUE);
        System.out.println("Min value of a char: " + Character.MIN_VALUE);

        char space = '\u00A0';
        char back = '\b';
        char tab = '\t';
        char enter = '\n';

        System.out.println("¡Hola" + space + "Alex!");
        System.out.println("¡Hola" + back + "Alex!");
        System.out.println("¡Hola" + tab + "Alex!");
        System.out.println("¡Hola" + enter + "Alex!");
        System.out.println("¡Hola" + System.lineSeparator() + "Alex!");
    }
}
