package Stack;
import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st, int n ){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int top= st.pop();
        pushAtBottom(st,n);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void main() {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(5);
        st.push(56);
        st.push(23);
        st.push(1);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
