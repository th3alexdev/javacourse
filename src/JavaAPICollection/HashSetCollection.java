package JavaAPICollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {

        // Set doesn't allow duplicate values
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("uno");
        hs.add("cinco");

        System.out.println("Set<String> -> " + hs);
        System.out.println();

        String[] animals = {"dog", "cat", "bird", "dog", "elephant", "cat", "lion"};
        Set<String> animalsInSet = new HashSet<>();
        Set<String> repeatedAnimals = new HashSet<>();

        for (String animal: animals) {
            if(!animalsInSet.add(animal)) { // if the element is duplicate, returns false ❌
                System.out.println("Duplicate item -> " + animal);
                repeatedAnimals.add(animal);
            }
        }

        System.out.println("not duplicates: " + animalsInSet.size() + " -> " + animalsInSet);
        System.out.println("duplicates -> " + repeatedAnimals);


        // Iterating a HashSet with foreach
        for(String str: hs) {
            System.out.println(str);
        }

        System.out.println();

        // Iterating a HashSet with foreach
        Iterator<String> iterateSet = hs.iterator();
        while(iterateSet.hasNext()){
            String item = iterateSet.next();
            System.out.println(item);
        }
    }
}
