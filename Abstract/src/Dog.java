public class Dog extends  Mammal{
    private  String earShape;
    private String tailShape;


    public Dog (String type,String size,double weigh){
        super(type,size,weigh);
    }
    @Override
    public void move(String speed) {
        if (speed=="Slow"){
            System.out.println("Dog Walking");
        }
        else{
            System.out.println("Dog Running");
        }
    }
    @Override
    public void makeNoise() {
        if (type=="Chihuahua"){
            System.out.println("Cry, Cry");
        }
            System.out.println("Guauu Guauuu");
    }
    public void sheHair(){
        System.out.println(getExplicitType()+" Shed Hair all the time");
    }
}
