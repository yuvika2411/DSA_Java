package Stack;

import java.util.Stack;

public class displayStack {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    static void main() {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(5);
        st.push(56);
        st.push(23);
        st.push(1);
        displayRec(st);
        //System.out.println(st);

//        Stack<Integer> rt =new Stack<>();
//        while(st.size()>0){
//            //int x= st.pop();
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int x= rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

//        int n= st.size();
//        int arr[]= new int [n];
//        for(int i=n-1;i>=0;i--){
//            int x= st.pop();
//            arr[i]=st.pop();
//        }
//        for(int i=0;i<n;i++){
//            st.push(arr[i]);
//        }

    }
}
