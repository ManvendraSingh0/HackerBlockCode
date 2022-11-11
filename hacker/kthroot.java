import java.util.*;

public class kthroot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            long num=in.nextLong();
            long n=in.nextLong();
            long lo=1;
            long hi=num;
            long ans=0;
            while(lo<=hi)
            {
                long mid=(lo+hi)/2;
                if(Math.pow(mid, n)<=num)
                {
                    ans=mid;
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
            System.out.println(ans);


        }

    }
}
