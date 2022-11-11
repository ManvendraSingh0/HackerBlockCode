import java.util.Scanner;

public class reversenumber {
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rem=0,sum=0,mul=1;
        int temp=n;
        if(n<0)
        {
            
            n=n*(-1);
        }

		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			
			n=n/10;
		}
        if(temp>0)
        {System.out.println(sum);}
        else
        System.out.println(sum*(-1));
		
        // Your Code Here
    }
    
}
