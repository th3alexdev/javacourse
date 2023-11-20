package OOP_I;
public class ExampleCarIII {
    public static void main(String[] args) {
        /*
          Example with constructor.
        */
        Car gol1 = new Car("Volkswagen", "Gol", "red", 2018, 20);
        Car gol2 = new Car("Volkswagen", "Gol", "red", 2018, 20);
        Car fiesta = new Car("Ford", "Fiesta", "gray", 2010, 45);

        String golDetails = gol1.allDetails();
        System.out.println(golDetails);

        System.out.println();

        System.out.println("Are they the same? -> " + (gol1 == gol2)); /* false */
        System.out.println("Are they the same? -> " + gol1.equals(gol2)); /* true */
        System.out.println("Are they the same? -> " + fiesta.equals(gol1)); /* false */
    }
}
