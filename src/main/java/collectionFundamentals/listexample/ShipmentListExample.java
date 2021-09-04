package collectionFundamentals.listexample;

import collectionFundamentals.common.Product;

import java.util.ArrayList;
import java.util.List;

public class ShipmentListExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(1,"Britania", "cookie", 20);
        Product product2 = new Product(2,"Kitkat", "Chocolate", 30);
        productList.add(product1);
        productList.add(product2);
        System.out.println(productList);
    }
}
