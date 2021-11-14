package praktika_eight;

public class Kangaroo extends Pet {
    public Kangaroo(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}