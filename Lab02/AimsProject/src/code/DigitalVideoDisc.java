package code;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDisc = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc() {
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%d. DVD - %s - %s - %s - %d: %.2f $", id, title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
}
