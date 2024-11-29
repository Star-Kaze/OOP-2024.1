package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
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

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for(DigitalVideoDisc dvd:dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc[] dvdList = {dvd1, dvd2};
        addDigitalVideoDisc(dvdList);
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

    public String totalCost() {
        double totalCost = 0;
        for(DigitalVideoDisc disc:itemsOdered){
            totalCost += disc.getCost();
        }
        return totalCost + " $";
    }

    public void print() {
        System.out.println("*".repeat(23) + "CART" + "*".repeat(23));
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("*".repeat(50));
    }

    public void searchID(int id) {
        int count = 0;
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOdered.get(i).getId() == id) {
                System.out.println(itemsOdered.get(i).toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not fought");
        } else {
            System.out.println("Total fought: " + count);
        }
    }

    public void searchTitle(String title) {
        int count = 0;
        for(DigitalVideoDisc dvd:itemsOdered) {
            if(dvd.isMatch(title)) {
                System.out.println(dvd.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not fought");
        } else {
            System.out.println("Total fought: " + count);
        }
    }

}
