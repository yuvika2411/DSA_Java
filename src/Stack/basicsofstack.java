package Stack;
import java.util.*;
//Stack works on the principle- FIFO first in first out

public class basicsofstack {
    public static void main(String [] args){
        Stack<Integer> st= new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(89);
        st.push(34);
        st.push(2);
        st.push(25);
        //peek

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is: "+st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
