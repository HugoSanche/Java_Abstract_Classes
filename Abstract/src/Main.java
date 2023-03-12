import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Anmal animal=new Animal("Generico","Small",20.2)
        Dog chihuahua=new Dog("Chihuahua","Small",2.00);
        chihuahua.makeNoise();
        doStuff(chihuahua);
        ArrayList<Animal> listAnimals=new ArrayList<>();
        listAnimals.add(chihuahua);
        listAnimals.add(new Dog("Cocker","Medium",8.00));
        listAnimals.add(new Dog("Pitbull","Height",20.00));

        listAnimals.add(new Cat("Siamese","Small",5.00));

        listAnimals.add(new Horse("Andalusian","Height",2000));

        for (var typeOfAnimal: listAnimals){
                doStuff(typeOfAnimal);
                //check currentMammal it's a temporaty variable
                if (typeOfAnimal instanceof Mammal currentMammal){
                    currentMammal.sheHair();
                   // typeOfAnimal.sheHair(); error
                }
        }
    }
    public static void doStuff(Animal animal){
        animal.move("Slow");
        animal.makeNoise();
    }
}
