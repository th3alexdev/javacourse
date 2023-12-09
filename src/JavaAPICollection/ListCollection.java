package JavaAPICollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> studentsList = new ArrayList<>();
        // List<String> studentsList = new LinkedList<>();
        studentsList.add("Alex");
        studentsList.add("Iván");
        studentsList.add("Ambar");
        studentsList.add("Fran");
        studentsList.add("Alex");

        System.out.println(studentsList);

        // Iterating a List with foreach
        for(String str: studentsList) {
            System.out.println(str);
        }

        System.out.println();

        // Iterating a List with foreach
        Iterator<String> iterateSet = studentsList.iterator();
        while(iterateSet.hasNext()){
            String item = iterateSet.next();
            System.out.println(item);
        }

        System.out.println();

        // Iterating a List using .foreach method
        studentsList.forEach(System.out::println); // (str) -> System.out.println(str)

        System.out.println();

        // Iterating a List using for-i
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }
    }
}
