import java.util.Scanner;

public class lect2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;

        for(int i=0;i<=n;i++)
        {
            int c=a+b;
            a=b;

            b=c;
            System.out.print( a+" ");
            
         }
         System.out.println();
         System.out.println(a+" is the "+n+"th term");
         
// public class Main {
//     public static void main(String args[]) {
// 		Scanner in =new Scanner(System.in);
// 		int n = in.nextInt();
// 		int sum = 0;
// 		int pos = 1;
// 		while(n>0)
// 		{
// 			int rem = n%10;
// 			sum=(int)(sum+pos*Math.pow(10,rem-1));
// 			n=n/10;
// 			pos++;

// 		}
// 		System.out.println(sum);

    }
}


