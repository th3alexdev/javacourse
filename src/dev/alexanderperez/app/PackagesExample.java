package dev.alexanderperez.app;

/* Preferred way to import package classes. */
import dev.alexanderperez.app.home.Person;
public class PackagesExample {
    public static void main(String[] args) {

        /* Secondary way to import classes from a package */
        // -> dev.alexanderperez.app.home.Person alex = new dev.alexanderperez.app.home.Person("Alex");

        Person alex = new Person("Alex");
        System.out.println(alex.toString());
    }
}
