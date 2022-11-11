package array;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the the number that you want to search:");
        int n=in.nextInt();
        int arr[]={2,3,-1,4,7,11,9};
        sindex(n,arr);    
    }
    public static void sindex(int n,int arr[])
    {
        int p=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                p=i;
            }
        }
        System.out.println(p);
    }
}