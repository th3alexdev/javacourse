package JavaAPICollection;

import JavaAPICollection.models.User;
import java.util.Set;
import java.util.HashSet;

public class TreeSetCollectionII {
    public static void main(String[] args) {

        Set<User> ts = new HashSet<>();
        ts.add(new User("Alexander", "Pérez", "th3alexdev"));
        ts.add(new User("Roberto", "Vondrak", "robertvondrank_"));
        ts.add(new User("Francisco", "Gómez", "codigoconarte"));



        System.out.println(ts);
    }
}
