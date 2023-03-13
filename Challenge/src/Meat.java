public class Meat extends ProductForSale {


    public Meat(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void details() {
        System.out.printf("""
                Type = %s
                Price = $%10.2f 
                Description = %s
                                
                """, type, price, description);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "type='" + getClass().getName() + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
