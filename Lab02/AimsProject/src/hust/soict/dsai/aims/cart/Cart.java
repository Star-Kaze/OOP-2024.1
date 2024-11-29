package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<>();


    public void addMedia(Media disc) {
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added!");
        } else {
            System.out.println("The cart is almost full!");
        }
    }

    public void addMedia(Media[] dvdList) {
        for(Media dvd:dvdList) {
            addMedia(dvd);
        }
    }

    public void addMedia(Media dvd1, Media dvd2) {
        Media[] dvdList = {dvd1, dvd2};
        addMedia(dvdList);
    }

    public void removeMedia(Media disc) {
        if(itemsOrdered.contains(disc)) {
            itemsOrdered.remove(disc);
            System.out.println("The disc has been removed!");
        } else {
            System.out.println("The cart do not have this disc!");
        }
    }

    public String totalCost() {
        double totalCost = 0;
        for(Media disc:itemsOrdered){
            totalCost += disc.getCost();
        }
        return totalCost + " $";
    }

    public void print() {
        System.out.println("*".repeat(23) + "CART" + "*".repeat(23));
        System.out.println("Ordered Items:");
        for (Media dvd:itemsOrdered) {
            System.out.println(dvd.toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("*".repeat(50));
    }

    public void searchID(int id) {
        int count = 0;
        for(Media dvd:itemsOrdered) {
            if(dvd.getId() == id) {
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

    public void searchTitle(String title) {
        int count = 0;
        for(Media dvd:itemsOrdered) {
            if(dvd.getTitle().equals(title)) {
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
