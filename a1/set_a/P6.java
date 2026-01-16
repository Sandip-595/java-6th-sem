import java.util.*;

public class P6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the number of elements : ");
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter the element for position "+i+" : ");
            list.add(scn.nextInt());
        }

        System.out.println("\n\nBefore sorting, the list is : "+list);
        Collections.sort(list);
         System.out.println("\n\nBefore sorting, the list is : "+list);
    }
}