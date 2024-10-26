package generics.customArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList<T> extends ArrayList<T> {

    private T[] values;

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    public CustomArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public T get(int index) {

        return values[index];
    }

    @Override
    public boolean add(T t) {
        T[] newvalues = (T[]) new Object[size() +1];
        for(int i = 0; i< size(); i++) {
            newvalues[i] = values[i];
        }
        newvalues[size()] = t;
        values = newvalues;
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = new CustomArrayList<>();
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
