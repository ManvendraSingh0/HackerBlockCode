import java.util.Scanner;

public class car {
    
    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int i=0;
		while(in.hasNext() && i<n)
		{
			i++;
			int cn=in.nextInt();
			int o=0,e=0;
			while(cn>0)
			{
				int o1=cn%10;
				if(o1%2==0)
				{
					e=e+o1;
				}
				else{
					o=o+o1;
				}
				cn=cn/10;				
			}
			if( e%4==0 || o%3==0 )
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");	
			}
		}

    }
}
