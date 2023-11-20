package OOP_I;
public class Car {
    private String manufacturer;
    private String model;
    private String color = GRAY_COLOR; // if we are using enum -> private Colors color = GRAY_COLOR;
    private Integer year;
    private Integer tankCapacity = 30;
    static String licensePlate;
    public static final Integer MAX_SPEED_HIGHWAY = 120;
    public static final String RED_COLOR = "red";
    public static final String GRAY_COLOR = "gray";
    public static final String BLUE_COLOR = "blue";
    public static final String BLACK_COLOR = "black";

    // * Constructor
    public Car(String manufacturer, String model, String color, Integer year, Integer tankCapacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.year = year;
        this.tankCapacity = tankCapacity;
    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(String manufacturer, String model, String color) {
        this(manufacturer, model);
        this.color = color;
    }

    public Car(String manufacturer, String model, String color, Integer year) {
        this(manufacturer, model, color);
        this.year = year;
    }

    // ! Getters
    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getYear() {
        return this.year;
    }

    // ! Setters
    public void setManufacturer(String newName) {
        this.manufacturer = newName;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setYear(Integer newYear) {
        this.year = newYear;
    }

    // ? Methods
    public String allDetails() {
        return "Manufacturer -> " + this.manufacturer +
                "\nModel -> " + this.model +
                "\nColor -> " + this.color +
                "\nYear -> " + this.year;
    }

    public String speedUp(int rpm) {
        return "The car is " + " accelerating at " + rpm + " rpm.";
    }

    public String brake() {
        return manufacturer + " is braking.";
    }

    public float calcOilConsume(int km, float gasolinePtg) {
        return km/(this.tankCapacity * gasolinePtg);
    }

    public static Integer getSpeed() {
        return Car.MAX_SPEED_HIGHWAY;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car) { // obj !== null
            Car otherCar = (Car) obj;

            boolean match1 = this.manufacturer.equals(otherCar.getManufacturer());
            boolean match2 = this.model.equals(otherCar.getModel());
            return (match1 && match2);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{ " +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", tankCapacity=" + tankCapacity +
                " }";
    }
}
