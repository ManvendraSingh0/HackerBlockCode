import java.util.Scanner;

public class anytoany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the base to change");
        int base= in.nextInt();
        
        System.out.println("eneter the number");
        int n = in.nextInt();
        System.out.println("enetr the base of number");
        int gbase= in.nextInt();
        int dec=0,mul=1;
        int sum1=0;
        while(n>0)
        {
            dec=n%10;
            sum1=sum1+dec*mul;//dec=reminder
            n=n/10;
            mul=mul*gbase;
        }
        int rem=0;
        int mul1=1;
        int sum=0;
        while(sum1>0)
        {
            rem=sum1%base;
            sum=sum+rem*mul1;
            sum1=sum1/base;
            mul1=mul1*10;

        }
        System.out.println(sum);
    }
    
}
