package playground;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        List<String> colList = Arrays.asList("a", "b");
        String x = "rejoice in the lord always and again I say rejoice philippians 4:4-8";
        List<Character> list = new ArrayList<Character>();
        for(char c : x.toCharArray()) {
            list.add(c);
        }
        Collections.shuffle(list);
        StringBuilder builder = new StringBuilder();
        for(char c : list) {
            builder.append(c);
        }
        String shuffled = builder.toString();

        System.out.println(shuffled); //e.g. llheo

    }

    public static void call(ArrayList<String> list) {
        show(list);
    }

    public static void show(List<String> list) {
        System.out.println(list.toString());
    }
}
