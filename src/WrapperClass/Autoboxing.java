package WrapperClass;
public class Autoboxing {
    public static void main(String[] args) {
        Integer[] evenNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for(Integer num: evenNumbers) {
            if (num.intValue() % 2 == 0) {
                sum += num.intValue();
            }
        }

        System.out.println("The result of the sum is -> " + sum);
    }
}
