import java.util.*;
public class histogram84 {
    public static void main(String[] args) {
        int [] arr={2,1,5,6,2,3};
        System.out.println(maxArearrect(arr));
    }

   public static int maxArearrect(int arr[])
    {
        Stack<Integer> st = new Stack<>();
        int Area=0;
        for(int j=0;j<arr.length;j++)
        {
            while(!st.isEmpty() && arr[j]<arr[st.peek()])
            {
                int r=j;
                int h=arr[st.pop()];
                if(!st.isEmpty())
                {
                    int l=st.peek();
                    Area = Math.max(Area,h*(r-l-1));
                }
                else
                Area= Math.max(Area,h*r);
            }
            st.push(j);
        }
        int r=arr.length;
         while(!st.isEmpty())
            {
               
                int h=arr[st.pop()];
                if(!st.isEmpty())
                {
                    int l=st.peek();
                    Area = Math.max(Area,h*(r-l-1));
                }
                else
                Area= Math.max(Area,h*r);
            }
            return Area;

    }
}
