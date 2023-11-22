package OOP_II;
public class Engine {
    private EngineType type;

    public Engine(EngineType type) {
        this.type = type;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}
