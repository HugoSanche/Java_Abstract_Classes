public class Cat extends  Animal{
    private  String earShape;
    private String tailShape;


    public Cat (String type,String size,double weigh){
        super(type,size,weigh);
    }
    @Override
    public void move(String speed) {
        if (speed=="Slow"){
            System.out.println("Cat Walking");
        }
        else{
            System.out.println("Cat Running");
        }
    }
    @Override
    public void makeNoise() {
        if (type=="Persian"){
            System.out.println("Always sleeping");
        }
        System.out.println("Miaummm Miaummmm");
    }
}
