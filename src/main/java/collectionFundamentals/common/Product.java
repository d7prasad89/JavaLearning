package collectionFundamentals.common;

import java.util.Comparator;

public class Product {
    int productId = 0;
    String name;
    String category;
    int price = 0;

    public Product(int productId, String name, String category, int price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "common.Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static final Comparator<Product> BY_PRICE = Comparator.comparingInt(Product::getPrice);
}
