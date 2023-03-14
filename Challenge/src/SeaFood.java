public class SeaFood extends ProductForSale{


    public SeaFood(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void details() {
        System.out.printf("""
                Product = %s
                Type = %s
                Price = $%10.2f 
                Description = %s
                
                """,getClass().getName(),type,price,description);
    }

    @Override
    public String toString() {
        return "SeaFood{" +
                "type='" + getClass().getName() + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
