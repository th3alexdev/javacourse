package dev.alexanderperez.app;

/* if we want to import some packages we use the wildcard */

import dev.alexanderperez.app.home.*;
public class PackagesExampleII {
    public static void main(String[] args) {
        Person alex = new Person("Alex");
        Cat pipo = new Cat();
        System.out.println(pipo.toString());
    }
}
