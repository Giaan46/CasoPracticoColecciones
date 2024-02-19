package tokio.school.database;

import tokio.school.database.domain.Address;
import tokio.school.database.domain.Order;
import tokio.school.database.domain.Product;

import java.util.HashSet;
import java.util.Set;

public class User {

    private long id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Set<Order> orders;
    private Set<Address> addresses;
    private Set<Product> wishList;

    public User(long id, String username, String password, String name, String surname, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        orders = new HashSet<>();
        addresses = new HashSet<>();
        wishList = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
