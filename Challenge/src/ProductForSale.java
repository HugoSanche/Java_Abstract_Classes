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
        System.out.printf("Quantity  %d price $%8.2f   %s Type %-15s %-35s %n",quantity,price,getSalesPrice(quantity),type,description);

       // System.out.println(type+"\t\t"+quantity+"\t\t"+price+"\t"+getSalesPrice(quantity));
    }
    public abstract void details();
}

