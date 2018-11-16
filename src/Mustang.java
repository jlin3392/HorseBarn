public class Mustang implements Horse {

    private String name;
    private double weight;

    public Mustang(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
