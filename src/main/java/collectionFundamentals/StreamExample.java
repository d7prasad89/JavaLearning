package collectionFundamentals;

import collectionFundamentals.common.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Product kitkat = new Product(1, "kitkat", "Chocolate", 3);
        Product eclairs = new Product(2, "eclairs", "Chocolate", 4);
        Product brittania = new Product(3, "brittania", "Cookie", 2);
        List<Product> productList = new ArrayList<>();
        productList.add(kitkat);
        productList.add(eclairs);
        productList.add(brittania);
        namesOfProductsWeightedSortedStreams(productList);
    }

    public static void namesOfProductsWeightedSortedStreams(final List<Product> productList) {
        productList.stream().filter(product -> product.getPrice()< 4)
                .sorted(Comparator.comparingInt(Product::getProductId))
                .map(Product::getPrice)
                .sorted()
                .forEach(System.out::println);

        productList.stream().filter(product -> product.getPrice()< 4)
                .sorted(Comparator.comparing(Product::getProductId))
                .forEach(StreamExample::print);

        System.out.println(" ");
        productList.stream().sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);

        //Collect Example
        System.out.println(" ");
        List<Product> lightWeightProduct = productList.stream().filter(product -> product.getPrice() < 4)
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.toList());
        System.out.println(lightWeightProduct);

        //Collect Example
        System.out.println(" ");
        Map<Integer, List<Product>> lightWeightMap = productList.stream().filter(product -> product.getPrice() < 4)
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.groupingBy(Product::getProductId));
        System.out.println(lightWeightMap);
    }


    public static void print(Product product){
        System.out.println(product);
    }

}
