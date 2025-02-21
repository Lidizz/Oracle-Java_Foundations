package duke.choice;

public class Customer {

    private String name;
    private String address;
    private String size;
    private Clothing[] items;

    public Customer() {
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public Customer(String name, String address, String size, Clothing[] items) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4,5,6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCoast() {
        double total = 0.0;
        for(Clothing item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
