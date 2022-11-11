import java.util.Scanner;

public class gamecoding {
    public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int i=0;
		while(in.hasNext() && i<t)
		{
			int m = in.nextInt();
			int n = in.nextInt();
			int a=1,h=2;
			while(a<m && h<n)
			{
				
                if(a>m)
			{
				System.out.println("Harshit");
			}a=a+2;
				
                if(h>n)
			{
				System.out.println("Aayush");
			}h=h+2;

			}	
		}
    }   
}
