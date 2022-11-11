import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int rem=0;
        int sum=0;
        int temp = n,tem2=n;
        int l=0;
        while(n>0)
        {
            rem=n%10;
            sum=(int) (sum+ Math.pow(rem,len(temp)));
            n=n/10;

        }
        if(sum==tem2)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
    public static int len(int temp)
    {int l=0;
        while(temp>0)
        {
            temp=temp/10;
            l++;

        }
        return l;
    }
}
