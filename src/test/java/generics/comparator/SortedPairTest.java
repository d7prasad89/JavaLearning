package generics.comparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortedPairTest {

    @Test
    public void testSortedPair(){
        SortedPair<Integer> sortedPair = new SortedPair<>(1, 2);
        Assertions.assertEquals(1, sortedPair.getLeft());
        Assertions.assertEquals(2, sortedPair.getRight());
    }

    @Test
    public void testSortedPairSwapping(){
        SortedPair<Integer> sortedPair = new SortedPair<>(2, 1);
        Assertions.assertEquals(1, sortedPair.getLeft());
        Assertions.assertEquals(2, sortedPair.getRight());
    }
}