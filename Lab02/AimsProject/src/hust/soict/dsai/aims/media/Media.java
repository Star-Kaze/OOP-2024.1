package hust.soict.dsai.aims.media;

public abstract class Media {
    private static int count = 0;
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title, String category, float cost) {
        count++;
        this.id = count;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title) {
        count++;
        this.id = count;
        this.title = title;
    }

    public Media() {
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%d. DVD  - %s - %d: %.2f $", this.getId(), this.getTitle(), this.getCategory(), this.getCost());
    }
}
