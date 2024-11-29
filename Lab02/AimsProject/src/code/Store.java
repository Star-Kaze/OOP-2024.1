package code;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public ArrayList<DigitalVideoDisc> getItemsInStore() {
        return itemsInStore;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        itemsInStore.remove(dvd);
    }

    public void removeDVD(int index) {
        itemsInStore.remove(index);
    }
}
