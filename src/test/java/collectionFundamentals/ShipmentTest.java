package collectionFundamentals;

import collectionFundamentals.common.Product;
import collectionFundamentals.listexample.Shipment;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ShipmentTest {
    private Shipment shipment = new Shipment();
    Product product1 = new Product(1,"Marie", "Cookie", 2);
    Product product2 = new Product(2, "KitKat", "Chocolate", 3);
    Product product3 = new Product(3, "KitKat", "Chocolate", 4);
    Product product4 = new Product(4, "KitKat", "Chocolate", 5);

    @Test
    public void addTest(){
        shipment.add(product1);
        shipment.add(product2);
        assertThat(shipment, contains(product1, product2));
    }

    @Test
    public void priceTest(){
        shipment.add(product1);
        shipment.add(product2);
        shipment.add(product3);
        shipment.add(product4);
        shipment.prepare();
        assertThat(shipment.smallProduct, contains(product1, product2));
        assertThat(shipment.bigProduct, contains(product3, product4));
    }


}
