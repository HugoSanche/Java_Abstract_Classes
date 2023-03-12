//NOTE: THE CLASS MAMMAL ITS ABSTRACT IT'S NOT NECESSARY TO IMPLEMENTS:
// move(String speed);
//makeNoise();
//IN THIS CASE I DECIDE TO IMPLEMENT MOVE(String speed)
public abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weigh) {
        super(type, size, weigh);
    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+" ");
        System.out.println(speed=="Slow" ? "Walk" : "");
    }

    public abstract void sheHair();
}
