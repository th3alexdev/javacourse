package OOP_I;
public enum Colors {
    RED("red"),
    YELLOW("yellow"),
    BLUE("blue"),
    WHITE("blanco"),
    GRAY("gris");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
