package tokio.school.database;

import tokio.school.database.domain.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Database {

  private Set<Product> productsTable;

  public Database(){

      productsTable= new HashSet<>();
      productsTable.add(new Product(1,"Phone", 100));
      productsTable.add(new Product(2,"Pencil", 4));
      productsTable.add(new Product(3,"Glass", 5));
      productsTable.add(new Product(4,"Monitor", 250));
      productsTable.add(new Product(5,"Newspaper", 6));


  }


    public  Set<Product> findProducts(){
     return productsTable;

    }
    public Product findProduct(String name){
     return null;
    }

    public Set<Product> findProductByPrice(float minPrice, float maxPrice){
      return productsTable.stream()
              .filter(product -> product.getPrice() > minPrice)
              .filter(product -> product.getPrice() < maxPrice).collect(Collectors.toSet());
    }
}
