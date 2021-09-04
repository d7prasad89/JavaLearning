package collectionFundamentals.set;


import collectionFundamentals.common.Product;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class LightVendorSet {

    NavigableSet<Product> lightWeightSet = new TreeSet(Product.BY_PRICE);

    public Set<Product> getLightWeightList(Product product) {
        return lightWeightSet.headSet(product, false);
    }
}
