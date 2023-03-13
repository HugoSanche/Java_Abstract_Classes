import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> itemsProducts =new ArrayList<>();
        SeaFood  shrimp=new SeaFood("Shrimp",180.00,"Shrimp of Mexico");
        SeaFood   salmon=new SeaFood("Salmon",220.00,"salmon of Noruego");
        SeaFood   filapia=new SeaFood("Filapia",100.00,"Filapia blanco");

        Meat  pork=new Meat("Pork",173.50,"Pork of Mexico");
        Meat  chicken=new Meat("Chicken",110.00,"Chicken grange");
        Meat  beef=new Meat("Beef",187.50,"Beef of EU");

        itemsProducts.add(shrimp);
        itemsProducts.add(salmon);
        itemsProducts.add(filapia);

        itemsProducts.add(pork);
        itemsProducts.add(chicken);
        itemsProducts.add(beef);

        ArrayList<OrderItem> orderHugo=new ArrayList<>();

        addItems(orderHugo,5,pork);
        addItems(orderHugo,3,chicken);
        addItems(orderHugo,1,beef);
        addItems(orderHugo,2,salmon);

        printItems(orderHugo);

    }
    public static void addItems(ArrayList<OrderItem> orderListUser, int quantity, ProductForSale productForSale){
        OrderItem itemsToBuy=new OrderItem(quantity,productForSale);
        orderListUser.add(itemsToBuy);
    }
    public static  void printItems(ArrayList<OrderItem> list){
        System.out.println("Product\t Quantity\tPrice\tTotal");
        double total=0.00;
        for ( var listProducts:list){

           // System.out.println(listProducts);
            //if(listProducts instanceof ProductForSale currentItem);
            listProducts.productForSale().printPriceItem(listProducts.quantity());
            total=total+listProducts.productForSale().getSalesPrice(listProducts.quantity());
            listProducts.productForSale().details();
            }
        System.out.println("Total \t\t\t\t\t\t"+total);
        }
}

