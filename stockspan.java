import java.util.Stack;

public class stockspan {
    public static void main(String[] args) {
        int arr[]={30,35,40,38,35};
        int n=arr.length;
        int ans[] = new int[n];
       
        Stack<Integer> st=new Stack(); ///in this we put the  index of arrays element;
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
           st.pop();
           
        }
        if(!st.isEmpty()){
            ans[i]=i- st.peek(); 
        }
        else
        {
            ans[i]=i+1;
        }
        st.push(i);
        
    }
    for(int i:ans)
    {
        System.out.print(i+" ");
    }
    }
}
