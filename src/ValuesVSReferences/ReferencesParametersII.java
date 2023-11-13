package ValuesVSReferences;

class Person {
    private String name;

    public void setName(String newName) { // a setter
        this.name = newName;
    }

    public String getName() { // a getter
        return this.name;
    }
}
public class ReferencesParametersII {
    public static void main(String[] args) {
        Person Alex = new Person();
        Alex.setName("Alex");

        System.out.println();

        System.out.println("# before calling the test method");
        test(Alex);
        System.out.println("# after calling the test method");

        System.out.println("Developer's name is -> " + Alex.getName());

    }

    public static void test(Person person) {
        System.out.println("# start the test method");

        person.setName("Julián");

        System.out.println("# end the test method");
    }
}
