package array;

public class slidingwinvari {
    public static void main(String[] args) {
        int [] arr= {1,2,4,3,5,2,3};
        int k=10;
        System.out.println(Noofsubarr(arr, k));
    }
    public static int Noofsubarr(int []arr,int k) {
        int ans=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<arr.length)
         {// window grow
            p=p*arr[ei];
            // window shrink
            while(p>=k && si<=ei)
            {
                p=p/arr[si];
                si++;
            }
            // ans cal
            ans=ans+ei-si+1;
            ei++;

        }return ans;
        
    }
}
