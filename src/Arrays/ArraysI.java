package Arrays;
public class ArraysI {
    public static void main(String[] args) {

        // Array's structure -> String[] variable = {}

        String[] names = {"Alex", "Daniel", "Peter"};
        int amount = names.length;

        for (int i = 0; i < amount; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = {2, 14, 32, 52, 19};

        for (int num: numbers) {
            System.out.println("The number is -> " + num);
        }
    }
}
