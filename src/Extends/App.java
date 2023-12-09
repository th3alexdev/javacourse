package Extends;
import Extends.models.*;

public class App {
    public static void main(String[] args) {
        Student student = new Student("", "");
        student.setName("Alexander");
        student.setLastname("Pérez");
        student.setCollege("Institute of Venezuela");
        student.setMathGrade(5.8);
        student.setSpanishGrade(9.2);
        student.setPhysicsGrade(4.3);

        System.out.println(student.toString());


        Teacher teacher = new Teacher();
        teacher.setName("Francisco");
        teacher.setLastname("Gómez");
        teacher.setSubject("Arts");

        System.out.println(teacher.toString());


        ForeignStudent foreignStudent = new ForeignStudent("", "");
        foreignStudent.setName("Frederik");
        foreignStudent.setLastname("Vondrak");
        foreignStudent.setCountry("Irland");
        foreignStudent.setNativeLang("Irish");
        student.setMathGrade(9.6);
        student.setSpanishGrade(5.4);
        student.setPhysicsGrade(8.9);

        System.out.println(foreignStudent.toString());

        System.out.println();

        Class fstudClass = foreignStudent.getClass();
        while(fstudClass.getSuperclass() != null) {
            String children = fstudClass.getName();
            String parent = fstudClass.getSuperclass().getName();
            System.out.println(children + " is a child class of -> " + parent);

            fstudClass = fstudClass.getSuperclass();
        }
    }
}
