package StackDemo;

import java.util.Stack;

public class StackDemo {
    public static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack : " + st);
        System.out.println("Pop : " + st.pop());
        System.out.println("Pop : " + st.pop());
        System.out.println("Stack : " + st);

        st.push(60);
        st.push(70);
        System.out.println("Stack : " + st);

        System.out.println("Pop : " + st.pop());
        System.out.println("Pop : " + st.pop());
        System.out.println("Stack : " + st);
    }
}
