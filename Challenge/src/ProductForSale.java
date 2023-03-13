public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){

        return quantity*price;
    }
    public void printPriceItem(int quantity){
        System.out.println("Quantity "+quantity+ " price "+price);
    }
    public abstract void details();
}
