package dev.alexanderperez.app.home;
public class Cat {
    private String name;

    public Cat() {
        this.name = "Pipo";
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat {" + '\n' +
                "\t name='" + name + '\'' + '\n' +
                '}';
    }
}
