import java.util.Scanner;

public class maximumpath
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n1=in.nextInt();
            int n2=in.nextInt();
            int []arr=new int[n1];
            int []arr1=new int[n1];
            int p1=0,p2=0;
            while(p1<n1)
            {
                arr[p1]=in.nextInt();
                p1++;
            }
            while(p2<n1)
            {
                arr1[p1]=in.nextInt();
                p2++;
            }
            
        }
    }
}