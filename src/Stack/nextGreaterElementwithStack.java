package Stack;

import java.util.Stack;

public class nextGreaterElementwithStack {
    static void main() {
        int arr[]= {1,5,3,2,1,6,3,4};
        int[] res= new int[arr.length];
        int n= arr.length;
        Stack<Integer> st= new Stack<>();

        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
