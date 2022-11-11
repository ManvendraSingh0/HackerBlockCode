package array;

public class kedancircilar {
    public static void main(String[] args) {
        int []arr={-2,-3,-1};
        System.out.println(maxsum(arr));
    }
    public static int kedan(int[]arr) {
        int sum=0;int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans=Math.max(sum,ans);
            if(sum<0)
            {
                sum=0;
            }
        }
        return(ans);

    }
        
    
        
    public static int maxsum(int arr[]) {
        int lsum=kedan(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            arr[i]=arr[i]*(-1);
        }
        int midsum=kedan(arr);
        sum +=midsum;
        if(sum==0) return lsum;
        return Math.max(lsum,sum);
        
    }

    
}
