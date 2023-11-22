package dev.alexanderperez.app.garden;
public class Dog {
    private String name;

    public Dog() {
        this.name = "Bingo";
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
