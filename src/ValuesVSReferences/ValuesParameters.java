package ValuesVSReferences;
public class ValuesParameters {
    public static void main(String[] args) {
        Integer num = 10;

        System.out.println("\"num\" in Main method -> " + num);

        test(num); // Call test method
    }
    public static void test(Integer value) {
        System.out.println("\"num\" in Test method -> " + value);
        value = 10000;

        System.out.println("new value => " + value);
    }
}
