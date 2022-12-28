import java.util.Deque;
import java.util.LinkedList;

public class maximumwindow239 {
    public static void main(String[] args) {
        int [] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for(int i:maxSlideW(arr, k))
        {
            System.out.println(i);
        }

    }
    public static int [] maxSlideW(int arr[], int k) {
        Deque<Integer> dq = new LinkedList<>();
        int [ ] ans= new int[arr.length-k+1];
        int j=1;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&arr[i]>arr[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=arr[dq.getFirst()];
        for(int i=k;i<arr.length;i++)
        {
            while(!dq.isEmpty()&&arr[i]>arr[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.add(i);
            if(!dq.isEmpty()&&dq.getFirst()==i-k)
            {
                dq.removeFirst();
            }
            ans[j]=arr[dq.getFirst()];
            j++;;

        }
        return ans;

        
    }
    
}
