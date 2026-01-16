import java.util.*;

public class P1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Table");
        list.add("cycle");
        list.add("box");
        list.add("headphones");
        list.add("phone");

        
        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

       
        System.out.println("\nUsing foreach:");
        for (String str : list) {
            System.out.println(str);
        }

        list.add(2, "water");
        System.out.println("\nAfter inserting at index 2: " + list);

        list.remove("box");
        System.out.println("After removing element box: " + list);

        if (list.contains("pen")) {
            System.out.println("Pen exists in the list");
        } else {
            System.out.println("Pen does not exist in the list");
        }
    }
}