package collectionFundamentals.listexample;

import collectionFundamentals.common.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{

    private final List<Product> productList = new ArrayList<>();
    public List<Product> smallProduct = new ArrayList<>();
    public List<Product> bigProduct = new ArrayList<>();
    public int SMALL_PRICE_MAX_LIMIT = 4;

    public void add(Product product) {
        productList.add(product);
    }

    public void prepare() {
        productList.sort(Product.BY_PRICE);

        int splitPoint = findSplitPoint();

        smallProduct = productList.subList(0, splitPoint);
        bigProduct = productList.subList(splitPoint, productList.size());
    }

    @Override
    public Iterator<Product> iterator() {
        return productList.iterator();
    }

    private int findSplitPoint() {
        for (int i = 0; i< productList.size(); i++) {
            Product product = productList.get(i);
            if(product.getPrice() >= SMALL_PRICE_MAX_LIMIT) {
                return i;
            }
        }
        return 0;
    }
}
