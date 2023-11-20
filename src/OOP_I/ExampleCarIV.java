package OOP_I;

public class ExampleCarIV {
    public static void main(String[] args) {
        Car landcruiser = new Car("Toyota", "Land Cruiser", Car.BLACK_COLOR, 2000, 85);

        // landcruiser.setColor(Colors.RED);

        System.out.println(landcruiser.toString());

        // Call a static attribute
        System.out.println(Car.MAX_SPEED_HIGHWAY);

        // Call a static method
        System.out.println(Car.getSpeed());
    }
}
