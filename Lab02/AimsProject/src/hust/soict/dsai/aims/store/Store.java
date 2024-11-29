package hust.soict.dsai.aims.store;


import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media dvd) {
        itemsInStore.add(dvd);
    }

    public void removeMedia(Media dvd) {
        itemsInStore.remove(dvd);
    }
}
