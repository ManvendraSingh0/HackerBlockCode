package array;

public class kedan {//linear keadan's
    public static void main(String[] args) {
        int []arr={8,-8,9,-9,10,-11,12};
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
        System.out.println(ans);

    }
}
