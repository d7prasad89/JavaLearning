package javaFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Playground {
    public static void main(String[] args) {
        String str = "a, b, c";
        StringTokenizer tokenizer = new StringTokenizer(str, ",");
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextToken());
        }
        Map<Integer, Integer> map = new LinkedHashMap<>();
        map.put(0, 1);
        map.put(0, 2);
        System.out.println(map);
    }
}
