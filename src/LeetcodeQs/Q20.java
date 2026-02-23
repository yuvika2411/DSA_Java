package LeetcodeQs;

import java.util.Scanner;
import java.util.Stack;

public class Q20 {
    static boolean main() {
        Stack<Character> st = new Stack<>();
        Scanner sc= new Scanner (System.in);
        String s= sc.next();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                } else {
                    char top = st.peek();
                    if ((ch == '}' && top == '{') ||
                            (ch == ']' && top == '[') ||
                            (ch == ')' && top == '(')) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (st.size() > 0) return false;
        else return true;
    }
}
