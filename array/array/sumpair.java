package array;
import java.util.*;
public class sumpair {   
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr[]= new int[n];
            int p=0;
            while(p<n)
            {
                arr[p]=in.nextInt();
                p++;
            }
            int m =in.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i!=j && i<j)
                    {
                        if(arr[i]+arr[j]==m)
                        {
                            System.out.println(Math.min(arr[i], arr[j])+" and "+Math.max(arr[i], arr[j]));
                        }
                    }
                }
            }
    }    
}
