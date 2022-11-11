public class merge2sortarr {
    public static void main(String[] args) {
        int a[]={1,3};
        int b[]={2,5};
        int al=a.length;
        int bl=b.length;
        int ans1[]=mergeTwoArray(a, b, al, bl);
        for(int i:ans1)
        {
            System.out.print(i+" ");
        }

    }
    public static int [] mergeTwoArray(int [] ar1,int [] arr2,int al,int bl) {
        int i=0;
        int j=0;
        int k=0;
        int [] ans= new int[al+bl];
        while(i<al&&j<bl)
        {
            if(ar1[i]<arr2[j])
            {
                ans[k]=ar1[i];
                i++;
                k++;
            }
        else{
            {
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }}
        while(i<ar1.length)
        {
            ans[k]=ar1[i];
                i++;
                k++;
        }
        while(j<arr2.length)
        {
            ans[k]=arr2[j];
                j++;
                k++;
        }
        if(ans.length%2!=0)
        {
            double m=(double)ans[ans.length/2];
            System.out.println( String.format("%.5f", m));
        }
        else{
            int n1=ans.length/2;
            double m=(double)(ans[n1]+ans[n1-1])/2;
            System.out.println( String.format("%.5f", m));
        }
        return ans; 
    }
}
