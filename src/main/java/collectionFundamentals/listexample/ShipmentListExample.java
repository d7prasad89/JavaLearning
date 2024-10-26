package collectionFundamentals.listexample;

import collectionFundamentals.common.Product;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ShipmentListExample {
    public static void main(String[] args) {
//        List<Product> productList = new ArrayList<>();
//        Product product1 = new Product(1,"Britania", "cookie", 20);
//        Product product2 = new Product(2,"Kitkat", "Chocolate", 30);
//        productList.add(product1);
//        productList.add(product2);
//        System.out.println(productList);
//          new ShipmentListExample().testRecursive(5);

        String sample = "Test \n";
//        sample = sample.replace("\n", "\n    123");
        sample = String.format("%-20s rws", sample);
        System.out.println(sample);
    }

//    void testRecursive(int count) {
//        System.out.println("Test Recursive "+ count);
//        count --;
//        if(count>0) {
//            testRecursive(count);
//        }
//    }
}
