public abstract class Animal {
    protected String type;
    private String size;
    private double weigh;

    public Animal(String type, String size, double weigh) {
        this.type = type;
        this.size = size;
        this.weigh = weigh;
    }
    public abstract void move(String speed);
    public abstract void makeNoise();
}
