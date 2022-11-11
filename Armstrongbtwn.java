import java.util.Scanner;
import java.util.*;
public class Armstrongbtwn 
{
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n1= in.nextInt();
        int n2 = in.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            arms(i);
        }
    }
    public static int len1(int num)
    {
        int l=0;
        while(num>0)
        {
            num=num/10;
            l++;
        }
        return l;
    }
    public static void arms(int num)
    {
        int num1=num;
        int rem=0,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=(int)(sum+Math.pow(rem, len1(num1)));
            num=num/10;            
        }
        if(num1==sum)
        {
            System.out.println(sum);
        }
    }
}


    

