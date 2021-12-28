package TheFeatures.OfForCollection;

import java.util.*;

public class CollectionExample {

    public void collectionExample(){

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);

        List<String> list2 = Arrays.asList("Ankit", "Prafull");

        Set<String> set = new HashSet<>();

        set.add("Prafull");
        set.add("Ankit");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ankit");
        map.put(2, "Prafull");

        /*
            New ways of doing it is ----
        */

        List<String> newList = List.of("Ankit", "Prafull");
        Set<String> newSet = Set.of("Ankit", "Prafull");
        Map<Integer, String> newMap1 = Map.of(1, "Ankit", 2, "Prafull");
        Map<Integer, String> newMap2 = Map.ofEntries(Map.entry(1, "Prafull"), Map.entry(2, "Prafull"));


    }

}
