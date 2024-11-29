package hust.soict.dsai.aims;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 9.78f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 7.78f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 8.78f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 4.78f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 5.78f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 2.78f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.addDigitalVideoDisc(dvd5);
        anOrder.addDigitalVideoDisc(dvd6);
        anOrder.removeDigitalVideoDisc(dvd6);
        System.out.println(anOrder.totalCost());
        System.out.println(anOrder.getQtyOrdered());
    }


}
