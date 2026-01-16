import java.util.*;

public class P5{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of integers for list :");
        int n = scn.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("\nEnter the element for position "+i+" : ");
            list.add(scn.nextInt());
        }

        HashSet<Integer> set = new HashSet<>(list);

        Iterator<Integer> itr = set.iterator();
        System.out.println("\n\nThe unique elements are : ");

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
