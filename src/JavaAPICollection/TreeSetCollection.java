package JavaAPICollection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        Set<String> tsStrings = new TreeSet<>();
        tsStrings.add("uno");
        tsStrings.add("dos");
        tsStrings.add("tres");
        tsStrings.add("uno");
        tsStrings.add("cinco");

        System.out.println("TreeSpeed<String> -> " + tsStrings);


        Set<Integer> tsIntegers = new TreeSet<>();
        tsIntegers.add(1);
        tsIntegers.add(4);
        tsIntegers.add(2);
        tsIntegers.add(5);
        tsIntegers.add(3);

        System.out.println("TreeSpeed<Integer> -> " + tsIntegers);


        // Set<Integer> tsIntegersInverted = new TreeSet<>((a, b) -> b.compareTo(a));
        Set<Integer> tsIntegersInverted = new TreeSet<>(Comparator.reverseOrder());
        tsIntegersInverted.add(1);
        tsIntegersInverted.add(4);
        tsIntegersInverted.add(2);
        tsIntegersInverted.add(5);
        tsIntegersInverted.add(3);

        System.out.println("TreeSpeed<Integer> -> " + tsIntegersInverted);

        System.out.println();

        // Iterating a TreeSet with foreach
        for(String str: tsStrings) {
            System.out.println(str);
        }

        System.out.println();

        // Iterating a TreeSet with foreach
        Iterator<String> iterateSet = tsStrings.iterator();
        while(iterateSet.hasNext()){
            String item = iterateSet.next();
            System.out.println(item);
        }

        System.out.println();

        // using .foreach method
        tsStrings.forEach(System.out::println); // (str) -> System.out.println(str)
    }
}
