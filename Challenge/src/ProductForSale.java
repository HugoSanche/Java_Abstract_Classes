public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){

        return quantity*price;
    }
    public void printPriceItem(int quantity){
        //System.out.printf("Type %s Quantity %d price $%10.2f %n ",type,quantity,price)

        System.out.println(type+"\t\t"+quantity+"\t\t"+price+"\t"+getSalesPrice(quantity));
    }
    public abstract void details();
}

