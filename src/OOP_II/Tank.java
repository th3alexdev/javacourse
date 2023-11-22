package OOP_II;
public class Tank {
    private int capacity;

    public Tank() { // default value
        this.capacity = 40;
    }

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
