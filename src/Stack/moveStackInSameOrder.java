package Stack;

import java.util.Stack;
import java.util.*;

public class moveStackInSameOrder {
    static void main() {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        int n;
        System.out.print("Enter no of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println("Original" +st);

        //reverse order
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
//            int x= st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());
        }
        System.out.println("Reversed " + rt);
    }
}
