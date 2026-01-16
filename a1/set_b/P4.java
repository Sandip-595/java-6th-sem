import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        int ch;

        System.out.print("How many elements you want to add : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        do {
            System.out.println("\n1. Sort the list");
            System.out.println("2. Reverse the list");
            System.out.println("3. Swap two elements");
            System.out.println("4. Find Maximum and Minimum");
            System.out.println("5. Search an element");
            System.out.println("6. Frequency of an element");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");

            ch= sc.nextInt();

            switch (ch) {
                case 1:
                    Collections.sort(list);
                    System.out.println("Sorted List: " + list);
                    break;

                case 2:
                    Collections.reverse(list);
                    System.out.println("Reversed List: " + list);
                    break;

                case 3:
                    System.out.print("Enter first index: ");
                    int i1 = sc.nextInt();
                    System.out.print("Enter second index: ");
                    int i2 = sc.nextInt();

                    Collections.swap(list, i1, i2);
                    System.out.println("After swapping, updated List: " + list);
                    break;

                case 4:
                    int max = Collections.max(list);
                    int min = Collections.min(list);
                    System.out.println("Maximum value: " + max);
                    System.out.println("Minimum value: " + min);
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    if (list.contains(key))
                        System.out.println(key + " found at index: " + list.indexOf(key));
                    else
                        System.out.println(key + " not found");
                    break;

                case 6:
                    System.out.print("Enter element to find frequency: ");
                    int ele = sc.nextInt();

                    int freq = Collections.frequency(list, ele);
                    System.out.println("Frequency of " + ele + " is: " + freq);
                    break;

                case 7:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 7);
    }
}
