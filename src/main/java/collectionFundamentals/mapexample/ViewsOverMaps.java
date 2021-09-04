package collectionFundamentals.mapexample;


import collectionFundamentals.common.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps {
    public static void main(String[] args) {
        final Map<Integer, Product> idToProduct = new HashMap<>();
        Product kitkat = new Product(1, "kitkat", "Chocolate", 3);
        Product eclairs = new Product(2, "eclairs", "Chocolate", 4);
        Product brittania = new Product(3, "brittania", "Cookie", 2);

        idToProduct.put(kitkat.getProductId(), kitkat);
        idToProduct.put(eclairs.getProductId(), eclairs);
        idToProduct.put(brittania.getProductId(), brittania);

        //System.out.println(idToProduct);

        Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        for (Map.Entry<Integer, Product> entry:
             entries) {
            //System.out.println(entry);
            //System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
            // set entry value
            //entry.setValue(brittania);
        }

        System.out.println(idToProduct.getOrDefault(7, new Product(7, "asd", "ad", 6)));
        Product product = idToProduct.computeIfAbsent(4, id ->
             new Product(23, "asd", "asd", 8));
        idToProduct.replaceAll((id, prod) -> {
            return new Product(id, prod.getName(), prod.getCategory(), prod.getPrice()+10);
        });
        System.out.println(idToProduct);

        //foreach
        idToProduct.forEach((id, prod) -> {
            System.out.println(prod.getName() +" has a id of "+id);
        });

        String[] array = new String[5];
        array[0] = "Hello1";
        array[1] = "Hello2";
        array[2] = "Hello3";
        array[3] = "Hell4";
        array[4] = "Hell5";

        for(int i = array.length-1; i >= 0; i --) {
            System.out.println(array[i]);
        }
        System.out.println(String.format("Date %d", LocalDate.now().getYear()));
    }
}
