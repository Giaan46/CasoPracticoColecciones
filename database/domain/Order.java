package tokio.school.database.domain;

import tokio.school.database.User;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Order {
    public enum Status{
        NOT_READY, READY, PAID, SENT
    }

    private long id;
    private String number;
    private float price;
    private LocalDateTime dateTime;
    private Status status;
    private User user;
    private Set<Product> products;

    public Order(long id, String number, User user){
        this.id = id;
        this.number = number;
        price = 0;
        dateTime = LocalDateTime.now();
        status = Status.NOT_READY;
        products = new HashSet<>();
        this.user = user;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    public boolean addProduct(Product product){
        price += product.getPrice();
    return products.add(product);

    }
}
