package set_c;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.println("Enter 10 integers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + " : ");
            ts.add(sc.nextInt());
        }

        System.out.println("\nElements in TreeSet (Sorted Order): " + ts);

        System.out.println("Smallest element: " + ts.first());
        System.out.println("Largest element: " + ts.last());

        System.out.print("\nEnter a number to remove: ");
        int rem = sc.nextInt();

        if (ts.remove(rem)) {
            System.out.println(rem + " removed successfully.");
        } else {
            System.out.println(rem + " not found in the set.");
        }

        System.out.println("Updated TreeSet: " + ts);

        System.out.print("\nEnter a number to test navigable methods: ");
        int num = sc.nextInt();

        System.out.println("Lower than " + num + " : " + ts.lower(num));
        System.out.println("Higher than " + num + " : " + ts.higher(num));
        System.out.println("Floor of " + num + " : " + ts.floor(num));
        System.out.println("Ceiling of " + num + " : " + ts.ceiling(num));

        System.out.println("\nUsing pollFirst(): " + ts.pollFirst());
        System.out.println("Using pollLast(): " + ts.pollLast());
    }
}
