package OOP_II;
public class SuperCar {

    private String manufacturer;
    private String model;
    private String color;
    private Integer year;
    private Tank tank;
    private Engine engine;
    private Person owner;
    private Wheel wheels;
    private static int id;

    public SuperCar() {
        SuperCar.id += 1;
    }

    public SuperCar(String manufacturer, String model, String color, Integer year, Tank tank, Engine engine, Person owner, Wheel wheels) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
        this.tank = tank;
        this.engine = engine;
        this.owner = owner;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "SuperCar -> {\n" +
                "\t id=" + id + ",\n" +
                "\t manufacturer='" + manufacturer + '\'' + ",\n" +
                "\t model='" + model + '\'' + ",\n" +
                "\t color='" + color + '\'' + ",\n" +
                "\t year=" + year + ",\n" +
                "\t tank=" + tank + ",\n" +
                "\t engine=" + engine + ",\n" +
                "\t owner=" + owner + ",\n" +
                "\t wheels=" + wheels + ",\n" +
                '}';
    }


}
