package Extends.models;

public class Student extends Person {
    private String college;
    private double mathGrade;
    private double spanishGrade;
    private double physicsGrade;

    public Student(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public String toString() {
        return "Student -> {\n" +
                "\tname='" + getName() + "',\n" +
                "\tlastname='" + getLastname() + "',\n" +
                "\tcollege='" + college + "',\n" +
                "\tmathGrade=" + mathGrade + ",\n" +
                "\tspanishGrade=" + spanishGrade + ",\n" +
                "\tphysicsGrade=" + physicsGrade + "\n" +
                '}';
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(double spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }
}
