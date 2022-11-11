import java.util.Scanner;

public class fabonaccipattern {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a=0,b=1;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
        
    }
    
    
}
