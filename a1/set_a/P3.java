import java.util.*;

public class P3{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of key-value pair : ");
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            scn.nextLine();
            System.out.print("Enter the key : ");
            String key = scn.nextLine();
            System.out.print("Enter the value : ");
            int value = scn.nextInt();
            System.out.println();
            map.put(key,value);
        }
        scn.close();

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        System.out.println("\nThe entries of the map using iterator :");

        while (itr.hasNext()) {
            Map.Entry<String, Integer> e = itr.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println("\nThe entries of the map using for loop :");
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}