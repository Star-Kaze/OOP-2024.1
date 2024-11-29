package code;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc aladinDvd = new DigitalVideoDisc("Aladin");

        store.addDVD(jungleDvd);
        store.addDVD(aladinDvd);

        System.out.println(store.getItemsInStore().size());

        store.removeDVD(0);
        store.removeDVD(aladinDvd);

        System.out.println(store.getItemsInStore().size());
    }
}
