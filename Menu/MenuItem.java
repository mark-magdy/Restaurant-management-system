package Menu;

public class MenuItem {
    static int n = 1 ;
    private int id;
    private String title;
    private String description;
    private double price;
    //TODO   add quantity to make it appear in stock at the end

    public MenuItem(String title, String description, double price) {
        this.id = n++;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public MenuItem() {
        this.id = n++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuSection{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

}
