package duke.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {

        System.out.println("\n**Welcome to Duke Choice Shop!**\n");

        System.out.println("Minimum Price: " + Clothing.MIN_PRICE);

        Customer c1 = new Customer("Pinky", 3);

        Clothing[] items = {
                new Clothing("Blue Jacket", 20.09 ),
                new Clothing("Orange T-Shirt", 10.5, "S" ),
                new Clothing("Green Scarf", 5, "S" ),
                new Clothing("Blue T-Shirt", 10.5, "S" ),
        };

//        pass the items Array to the addItems method in Customer
        c1.addItems(items);

        System.out.println("Customer name is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCoast());
        int num = 0;
        for (Clothing item : c1.getItems()) {
            System.out.println("Item" + (++num) + ": " + item);
        }

        Clothing[] i = {
                new Clothing(),
                new Clothing()
        };

        int sum = 0;
        int average = 0;
        int count = 0;

        for(Clothing item: c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                sum += (int) item.getPrice();
            }
        }

        try {
            average = (count == 0) ? 0 : sum / count;
//            average = sum / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0.");
        }

        Arrays.sort(c1.getItems());

        for (Clothing item : c1.getItems()) {
            System.out.println("Sorted item Array: " + item);
        }
    }
}
