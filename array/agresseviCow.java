package array;
import java.util.*;

import java.util.Scanner;

public class agresseviCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0)
        {int nos= sc.nextInt();
        int noc=sc.nextInt();
        int[] stalls = new int[nos];
        for(int i=0;i<stalls.length;i++)
        {
            stalls[i]=sc.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(largestmindis(stalls, noc));
    }
    }
    public static int largestmindis(int[] stalls,int noc) {
        int lo=0;
        int hi=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(lo<=hi)
        {
            int mid=(hi+lo)/2;
            if(isitpossible(stalls,mid,noc)==true)
            {
                ans= mid;
                lo=mid+1;

            }
            else{
                hi=mid-1;
            }
        }return ans;
        
    }
    public static void isitpossible(int[] stalls,int mid,int noc) {
    int cow=1;
    int pos= stalls[0];
    int i=1;
    while(i<stalls.length)
    {
        if(stalls[i]-pos>=mid)
        {
         cow++;
            
        }
    }    
    }

}
