import java.util.*;

public class P4{
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements for stack :");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println();

        for(int i = 0;i<n;i++){
            System.out.print("Enter the element for offset "+i+" : ");
            st.push(scn.nextLine());
        }

        scn.close();
        System.out.println("The removed element is : "+st.pop());
    }
}
