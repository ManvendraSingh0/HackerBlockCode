import java.util.Stack;

public class nextGreaterInCircular {
    public static void main(String[] args) {
        int arr[]={10,2,1,3,4,8,7};
        int n=arr.length;
        int ans[] = new int[n];

       
        Stack<Integer> st=new Stack(); ///in this we put the  index of arrays element;
       
        for(int i=0;i<2*n;i++)
        {
            while(!st.isEmpty() && arr[i%n]>arr[st.peek()]){
            ans[st.pop()]=arr[i%n];
           
            }
            if(i<n)
            {
                st.push(i%n);
            }
        
        
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
