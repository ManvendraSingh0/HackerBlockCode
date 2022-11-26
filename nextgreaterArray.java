import java.util.Stack;

// import oops.stack.Stack;

// package oops.stack;

public class nextgreaterArray {
    public static void main(String[] args) {
        int arr[]={10,2,1,3,4,8,7};
        int n=arr.length;
        int ans[] = new int[n];
       
        Stack<Integer> st=new Stack(); ///in this we put the  index of arrays element;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
            ans[st.pop()]=arr[i];
           
            }
        st.push(i);
        } 
        while(!st.isEmpty()){
            ans[st.pop()]=-1;   
    }
    for(int i:ans)
    {
        System.out.print(i+" ");
    }
}
}
