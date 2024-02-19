package tokio.school.database.domain;

public class Product {

    private long id;
    private String name;
    private String description;
    private float price;

    public Product(long id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
        visible = true;
    }

    private boolean visible;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    @Override
    public String toString (){
        return name + "(" + price + ")";
    }
}
