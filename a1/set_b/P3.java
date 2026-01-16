import java.util.*;

public class P3{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(108,"Sandip");
        map.put(222,"Raj");
        map.put(303,"Vansh");
        map.put(88,"Neel");

        System.out.println("\nEntries before sorting according to employee IDs : ");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("\nID : "+entry.getKey());
            System.out.println("Name "+entry.getValue());
        }

        TreeMap<Integer,String> map1 = new TreeMap<>(map);
        
        System.out.println("\nEntries after sorting according to employee IDs : ");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("\nID : "+entry.getKey());
            System.out.println("Name "+entry.getValue());
        }
    }
}