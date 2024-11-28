package code;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemsOdered;
    private int qtyOrdered;

    public Cart() {
        itemsOdered = new ArrayList<>();
        qtyOrdered = 0;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added!");
        } else {
            System.out.println("The cart is almost full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOdered.contains(disc)) {
            itemsOdered.remove(disc);
            qtyOrdered--;
            System.out.println("The disc has been removed!");
        } else {
            System.out.println("The cart do not have this disc!");
        }
    }

    public double totalCost() {
        double totalCost = 0;
        for(DigitalVideoDisc disc:itemsOdered){
            totalCost += disc.getCost();
        }
        return totalCost;
    }

    public void printCart() {
        System.out.println("*".repeat(23) + "CART" + "*".repeat(23));
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOdered.get(i).toString());
        }
        System.out.println("*".repeat(51));
    }
}
