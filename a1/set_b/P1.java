import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();

        System.out.print("\nEnter " + n + " integers : ");
        for (int i = 0; i < n; i++) {
            list.add(scn.nextInt());
        }

        System.out.println("\n1. Elements in the list:");

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        int lessThan20 = 0, moreThan = 0;

        for (int num : list) {
            if (num <= 20)
                lessThan20++;
            else
                moreThan++;
        }

        System.out.println("\n\n2. Count of elements <= 20: " + lessThan20);
        System.out.println("2. Count of elements > 20: " + moreThan);

        itr = list.iterator();

        while (itr.hasNext()) {
            int ele = itr.next();
            if (ele > 20)
                itr.remove();  
        }

        System.out.println("\n4.Maximum value: " + Collections.max(list));
        System.out.println("4.Minimum value: " + Collections.min(list));

        System.out.println("\n5.Updated list:"+list);
    }
}
