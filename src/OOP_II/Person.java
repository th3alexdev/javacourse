package OOP_II;

public class Person {
    private String name;
    private String lastname;
    private Integer age;
    private String email;

    public Person(String name, String lastname, Integer age, String email) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person -> {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
