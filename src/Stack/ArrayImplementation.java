package Stack;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr= new int[5];
        private int idx= 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full. ");
                return;
            }
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
        int pop(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isFull(){
            if(size()==arr.length){
                return true;
            }
            else{
                return false;
            }
        }
    }
    static void main() {
        Stack st= new Stack();
        st.push(4);
        st.display();
        st.push(2);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(3);
        st.push(5);
        st.push(56);
        System.out.println(st.isFull());
        st.push(56);
        System.out.println(st);
    }
}
