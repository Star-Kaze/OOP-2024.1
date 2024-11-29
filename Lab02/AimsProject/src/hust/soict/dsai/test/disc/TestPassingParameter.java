package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDvd = new DigitalVideoDisc("Cinderella");

        swap(jungleDvd, cinderellaDvd);
        System.out.println("jungle dvd title: " + jungleDvd.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDvd.getTitle());

        changeTitle(jungleDvd, cinderellaDvd.getTitle());
        System.out.println("jungle dvd title: " + jungleDvd.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
