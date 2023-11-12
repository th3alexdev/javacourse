package WrapperClass;

import java.lang.reflect.Method;

public class GetClassMethod {
    public static void main(String[] args) {
        String str = "Hello from Java!";

        Class strClass = str.getClass();
        
        System.out.println("getName() -> " + strClass.getName());
        System.out.println("getSimpleName() -> " + strClass.getSimpleName());
        System.out.println("getPackageName() -> " + strClass.getPackageName());
        System.out.println("getPackageName() -> " + strClass.getSuperclass());
        for(Method m: strClass.getMethods()){
            System.out.println(m.getName());
        }

        System.out.println();

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("getName() -> " + intClass.getName());
        System.out.println("getSimpleName() -> " + intClass.getSimpleName());
        System.out.println("getPackageName() -> " + intClass.getPackageName());
        System.out.println("getPackageName() -> " + intClass.getSuperclass());
        for(Method m: intClass .getMethods()){
            System.out.println(m.getName());
        }
    }
}
