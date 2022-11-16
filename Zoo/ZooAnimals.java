package Zoo;

public abstract class ZooAnimals {
    protected String name;

    abstract String itBreathes();
    abstract String itMoves();
    public String toString() { return "It breathes: " + itBreathes() + ". It moves: " + itMoves() + ".";

    }
}
