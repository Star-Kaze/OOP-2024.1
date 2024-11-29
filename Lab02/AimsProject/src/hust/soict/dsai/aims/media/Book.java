package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book() {

    }

    public void addAuthor(String name) {
        if (this.authors.contains(name)) {
            System.out.println("This name has already existed");
        } else {
            this.authors.add(name);
            System.out.println("Adding author successfully");
        }
    }

    public void removeAuthor(String name) {
        if (this.authors.contains(name)) {
            this.authors.remove(name);
            System.out.println("Removing author successfully");
        } else {
            System.out.println("This name has not existed");
        }
    }
}
