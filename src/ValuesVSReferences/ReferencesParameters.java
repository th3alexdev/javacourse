package ValuesVSReferences;
public class ReferencesParameters {
    public static void main(String[] args) {
        int[] ages = {21, 32, 19, 18, 24};

        System.out.println("# before calling the test method");
        for (int n: ages) {
            System.out.println("age -> " + n);
        }

        test(ages);

        System.out.println();

        System.out.println("# after calling the test method");
        for (int n: ages) {
            System.out.println("age -> " + n);
        }
    }

    public static void test(int[] agesArr) {
        System.out.println("# start the test method");
        for (int i = 0; i < agesArr.length; i++) {
            agesArr[i] = agesArr[i] + 1;
        }
        System.out.println("# end the test method");
    }
}
