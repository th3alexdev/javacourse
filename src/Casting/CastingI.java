package Casting;

public class CastingI {
    public static void main(String[] args) {
        String numberStr = "50";
        int value = Integer.parseInt(numberStr);

        System.out.println("value = " + value);
        // -- 
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);

        System.out.println("realDouble = " + realDouble);
        // --
        String logicStr = "1";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);

        System.out.println("logicBoolean = " + logicBoolean);
        // --
        double otherNumberInt = 100;
        String otherNumberStr = Double.toString(otherNumberInt);

        System.out.println("otherNumberStr = " + otherNumberStr);
        // --
        otherNumberStr = String.valueOf(otherNumberInt);
        System.out.println("otherNumberStr = " + otherNumberStr);
    }
}
