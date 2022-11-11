package array;

import java.util.Scanner;

public class productofarrayexself {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long arr[]= new long[n];
		int p=0;
		while(p<n)
		{
			arr[p]=in.nextLong();
			p++;
		}
        long pr=1;
        for(int i=0;i<n;i++)
        {
            pr=pr*arr[i];
        }
        System.out.println(pr);
        int t=0;
		while(t<n)
		{
			arr[t]=pr/arr[t];
			t++;
		}
        for(long i:arr)
        {
            System.out.print(i+" ");
        }
    }
    
}
