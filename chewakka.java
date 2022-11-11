import java.util.Scanner;

public class chewakka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int sum=0,mul=1;
        while(num>0)
        {
            int rem=num%10;
            int a=9-rem;
            if(a<rem)
            {
                rem=a;
            }
            num=num/10;
            sum=sum+rem*mul;
            mul=mul*10;
        }
        System.out.println(sum);
    }
}
