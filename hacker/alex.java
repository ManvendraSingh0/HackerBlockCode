import java.util.Arrays;
import java.util.Scanner;

public class alex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       
        while(t>0)
        {
            t--;
            int n= in.nextInt();
            int arr[] = new int[n];
            int e=0;
            while(e<n)
            {
                arr[e]= in.nextInt();
                e++;
            }
           // arr[]=Arrays.sort(arr);
            int p = in.nextInt();
            int temp1=0;
            int temp2=0;
            Arrays.sort(arr);
            for(int i=0,j=i+1;i<n-1;i++,j++)
            {
                if(arr[i]+arr[j]==p)
                System.out.println("deepak buy "+arr[i]+" and "+arr[j]);
                // for(int j=i+1;j<n;j++)
                // {
                //     if(arr[i]+arr[j]==p)
                //     {
                //         if(arr[temp1]-arr[temp2]<arr[i]-arr[j])
                //         {
                //             temp1=i;temp2=j;
                //         }
                //     }
                // }
            }
            
        }
        
    }
    
}
