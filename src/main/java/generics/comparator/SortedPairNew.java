package generics.comparator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SortedPairNew<T extends Comparable<T>> {
    T left;
    T right;

    public SortedPairNew(T left, T right) {
        if(left.compareTo(right) < 0){
            this.left = left;
            this.right = right;
        } else {
            this.left = right;
            this.right = left;
        }
    }
}
