package Stack;

import java.util.Stack;

public class insertion {
    static void main() {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(5);
        st.push(56);
        st.push(23);
        st.push(1);
        System.out.println(st);
        int idx=2;
        int x=7;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
