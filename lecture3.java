import java.util.Scanner;

public class lecture3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number");342
        
        int a=in.nextInt();
        System.out.println("enter the source base");
        int sb=in.nextInt();
        System.out.println("enter the destination base");
        int db=in.nextInt();
        int sum=0;
        int mul=1;
        while(a>0)
        {
            int rem=a%db;
            sum=sum+rem*mul;
            a=a/db;
            mul=mul*sb;
        }
        System.out.println(sum);

        
    }
}
