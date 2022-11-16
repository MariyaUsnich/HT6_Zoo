package Zoo;

public class Goldfish extends Fish {
    private String typeName;
    public Goldfish() {
        typeName= "Goldfish";
    }
    public Goldfish(String _typeName) {
        typeName = _typeName;
    }
    @Override
    public String toString() {return typeName + ": " + super.toString();}
}
