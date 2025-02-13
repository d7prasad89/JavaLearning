package playground;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        Map<String, String> map = Map.of();
        map.forEach((k, v) -> System.out.println(v));
    }
}
