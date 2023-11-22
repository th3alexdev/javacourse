package OOP_II;

public class Wheel {
    private String manufacturer;
    private int rin;

    public Wheel(String manufacturer, int rin) {
        this.manufacturer = manufacturer;
        this.rin = rin;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }
}
