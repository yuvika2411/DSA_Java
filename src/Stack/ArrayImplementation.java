package Stack;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr= new int[5];
        private int idx= 0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }

    }
    static void main() {
        Stack st= new Stack();
//        st.push(4);
//        st.push(2);
//        st.push(1);
//        st.display();
//        System.out.println(st.size());
//        st.pop();
//        st.display();
    }
}
