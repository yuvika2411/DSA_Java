package Stack;

import java.util.Stack;

public class underFlowOverFlow {
    static void main() {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(5);
        st.push(56);
        st.push(23);
        st.push(1);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
