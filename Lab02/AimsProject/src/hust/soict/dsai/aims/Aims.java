package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 9.78f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 7.78f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 8.78f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 4.78f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 5.78f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("afsdfs", "adsfa", "adfsdfsdf", 89, 2.78f);
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);
        anOrder.addMedia(dvd4);
        anOrder.addMedia(dvd5);
        anOrder.addMedia(dvd6);
        anOrder.removeMedia(dvd6);
        System.out.println(anOrder.totalCost());
    }


}
