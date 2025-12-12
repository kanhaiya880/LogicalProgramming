package no100_learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Nandani");
        map.put(2,"Neha");
        map.put(3,"Apeksha");
        map.put(4,"manoj");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("manoj"));
        Set<Integer> keys=map.keySet();
        for(Integer i: keys)
        {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer,String>> entries=map.entrySet();

        for (Map.Entry<Integer,String> entry:entries)
        {
            System.out.println(entry.setValue(entry.getValue().toUpperCase()));
        }

        System.out.println(map);

    }
}
