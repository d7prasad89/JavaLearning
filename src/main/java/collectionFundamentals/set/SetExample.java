package collectionFundamentals.set;


import collectionFundamentals.common.Product;

import java.util.Collections;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        LightVendorSet lightVendorSet = new LightVendorSet();
        Set<Product> lightWeightSet = lightVendorSet.lightWeightSet;

        Product kitkat = new Product(1, "kitkat", "Chocolate", 3);
        Product eclairs = new Product(2, "eclairs", "Chocolate", 4);
        Product brittania = new Product(3, "brittania", "Cookie", 2);

        Collections.addAll(lightWeightSet, kitkat, eclairs, brittania);

        System.out.println(lightVendorSet.getLightWeightList(kitkat));



    }
}
