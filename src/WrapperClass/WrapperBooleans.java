package WrapperClass;
public class WrapperBooleans {
    public static void main(String[] args) {
        Integer a, b;
        
        a = 1;
        b = 2;
        
        boolean primitiveBoolean = a > b; /* false */
        Boolean instanceBoolean1 = Boolean.valueOf(primitiveBoolean); /* false */
        Boolean instanceBoolean2 = Boolean.valueOf("false"); /* false */
        Boolean instanceBoolean3 = false; /* false */

        System.out.println("primitive -> " + primitiveBoolean);
        System.out.println("instance#1 -> " + instanceBoolean1);
        System.out.println("instance#2 -> " + instanceBoolean2);

        System.out.println("Are they the same? -> " + (instanceBoolean2 == instanceBoolean3)); /* true */


    }
}
