// import oops.stack.Stack;
import java.util.*;

public class NumberValidSubar1063 {
    public static void main(String[] args) {
        int [] arr={1,4,2,5,3};
       System.out.println( ValidSubArray(arr));

    }
    public static int ValidSubArray(int arr[])
    {
        Stack<Integer> st= new Stack();
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<st.peek())
            {
                st.pop();
            }
            st.push(arr[i]);
            ans=ans+st.size();
        }
        return ans;
    }
}
