package Stack;

public class LLImplementation {
    public static class Node{ //user defined data type
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{ // user defined data structure
        private Node head=null;
        private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val +" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayrec(Node head){
            if(head==null) return;
            displayrec(head.next);
            System.out.print(head.val +" ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }
        int size(){ //getter
            return size;
        }
        int pop(){
            if(head==null) {
                System.out.println("Stack is empty");
            }
            int x= head.val;
            head= head.next;
            return x;
        }
        int peek(){
            if(head==null) {
                System.out.println("Stack is empty");
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }

    static void main() {
        LLStack st= new LLStack();
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
    }

}
