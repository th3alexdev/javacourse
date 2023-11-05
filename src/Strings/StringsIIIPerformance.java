package Strings;
public class StringsIIIPerformance {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder d = new StringBuilder(c);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            c =  c.concat(a).concat(b).concat("\n"); // # With Concat
            // c += a + b + "\n"; // # Without Concat
            // d.append(a).append(b).append("\n"); // # StringBuilder + Append
        }

        long end = System.currentTimeMillis();

        System.out.println("Time -> " + (end - start));

        /*
                     Using Concat Method: 500 iterations => 3ms/4ms
                   Without Concat Method: 500 iterations => 20ms/27ms
           StringBuilder + Append Method: 500 iterations => 0ms


                     Using Concat Method: 1000 iterations => 7ms/10ms
                   Without Concat Method: 1000 iterations => 30ms/40ms
           StringBuilder + Append Method: 1000 iterations => 0ms
        */
    }
}
