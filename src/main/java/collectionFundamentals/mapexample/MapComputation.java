package collectionFundamentals.mapexample;

import java.util.HashMap;
import java.util.Map;

public class MapComputation {
    public static void main(String[] args) {
        Map<Integer, Integer> totalMap = new HashMap<>();
        MapComputation mapComputation = new MapComputation();
        mapComputation.computeMap(totalMap);
        System.out.println(totalMap);
    }

     public void computeMap(Map<Integer, Integer> totalMap) {
         Integer orDefault = totalMap.getOrDefault(1, 30);
         System.out.println(orDefault);
         totalMap.computeIfAbsent(2, id -> id+1);
         System.out.println(totalMap);
    }
}
