import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.print("Enter the number of elements for HashSet and TreeSet: ");
        int n = scn.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            hashSet.add(scn.nextInt());  
        }

        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            treeSet.add(scn.nextInt());  
        }
        scn.close();

        System.out.println("\nHashSet using foreach:");
        for (int num : hashSet) {
            System.out.println(num);
        }

        System.out.println("\nHashSet using Iterator:");
        Iterator<Integer> itr1 = hashSet.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("\nTreeSet using foreach :");
        for (int num : treeSet) {
            System.out.println(num);
        }

        System.out.println("\nTreeSet using Iterator : ");
        Iterator<Integer> itr2 = treeSet.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}