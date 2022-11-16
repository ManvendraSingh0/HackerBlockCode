package oops.DSA.stack;

import java.util.Stack;

public class first {
    public static void main(String[] args) {
        // Stacks works on lifo(last in first out)
        // alaways top element pop or peek
        Stack<Integer> st = new Stack<>();
       for(int i=0;i<=10;i++)
       {
        st.add(i);
       }
       System.out.println(st.peek());
    }
}
