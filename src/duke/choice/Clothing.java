package duke.choice;

public class Clothing implements Comparable<Clothing>{

    private String description;
    private double price;
    public static final double MIN_PRICE = 10.0;
    public static final double TAX_RATE = 0.2;
    private String size = "M";

    public Clothing() {
    }

    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE) ;
    }

    public void setPrice(double price) {
        this.price = (price < MIN_PRICE) ? MIN_PRICE : price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return description + ", " + size + ", " + price;
    }


    @Override
    public int compareTo(Clothing c) {
        // The compareTo method will result in a - less than / equals / greater than
        return this.description.compareTo(c.description);
    }
}
