package OOP_II;
public class ExampleSuperCarI {
    public static void main(String[] args) {

        /* Yaris ✨*/
        Tank yarisTank = new Tank(50);
        Engine yarisEngine = new Engine(EngineType.HYBRID);

        Wheel yarisWheels = new Wheel("goodyear", 15);
        Person alex = new Person("Alexander", "Pérez", 21, "alexander@mail.com");
        SuperCar yaris = new SuperCar("Toyota", "Yaris", "gray", 2023, yarisTank, yarisEngine, alex, yarisWheels);

        System.out.println(yaris.toString());

        /* SuperDuty 🚗 */
        Tank superdutyTank = new Tank(80);
        Engine superdutyEngine = new Engine(EngineType.DIESEL);
        Wheel superdutyWheels = new Wheel("Brisdgestone", 22);
        Person javier = new Person("Javier", "Reveitte", 22, "jav@rev.com");
        SuperCar superduty = new SuperCar("Ford", "Super Duty", "white", 2020, superdutyTank, superdutyEngine, javier, superdutyWheels);
        System.out.println(superduty.toString());
    }
}
