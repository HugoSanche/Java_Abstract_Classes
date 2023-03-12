
//NOTE: IF CLASS MAMMAL IMPLEMENT SOME METHODS ABSTRACT OF PARENT ANIMAL IN THIS CLASS IS NO NECESSARY TO IMPLEMENTS
//FOR EXAMPLE: CLASS MAMMAL IMPLEMENTS METHOD MOVE(Speed) IN THIS CLASS ITS NOT NECESSARY TO IMPLEMENT ABSTRACT METHOD MOVE(Speed)
//BUT ITS NECESSARY TO IMPLEMENTS MAKENOISE() OF CLASS ANIMAL BECAUSE CLASS MAMMAL DID NOT IMPLEMENTS

public class Horse extends Mammal {
    public Horse(String type, String size, double weigh) {
        super(type, size, weigh);
    }

    @Override
    public void makeNoise() {
        System.out.println("Reliance");
    }

    @Override
    public void sheHair() {
        System.out.println(getExplicitType()+" Shed Hair");
    }
}

