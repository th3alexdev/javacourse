package WrapperClass;
public class WrapperOperators {
    public static void main(String[] args) {

        // Contain the same instance and value
        Integer a = Integer.valueOf(1000);
        Integer b = a;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("are they the same? -> " + (a == b)); /* true */

        System.out.println();

        // Contain the same value, but they aren't the same instance
        b = 1000;

        System.out.println("a -> " + a);
        System.out.println("b -> " + b);

        System.out.println("are they the same? -> " + (a == b)); /* false */

        // Convert to primitive (autoboxing)
        System.out.println("are they the same? -> " + (a.intValue() == b.intValue())); /* true */
    }
}
