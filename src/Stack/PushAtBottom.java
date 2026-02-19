package Stack;
import java.util.Scanner;
import java.util.Stack;

public class PushAtBottom {
    static void main() {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(5);
        st.push(56);
        st.push(23);
        st.push(1);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter element to insert at bottom: ");
        int n=sc.nextInt();
        pushatbottom(st,n);
        System.out.println(st);
    }

    public static void pushatbottom(Stack<Integer> st, int n ){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int top= st.pop();
        pushatbottom(st,n);
        st.push(top);
    }

}
