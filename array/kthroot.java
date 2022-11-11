import java.util.Scanner;

public class kthroot
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int i=0;
        while(in.hasNext()&&i<x)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            if(n >= Integer.MAX_VALUE && k>1)
            {
                long l=n;
                l=(long) Math.pow(l, k);

                String f=String.valueOf(l);
                int fl=f.length();
                System.out.println(fl);
            }
            else{
                
            }

        }
    }
    
}
