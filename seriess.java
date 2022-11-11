import java.util.Scanner;

public class seriess {
    
    public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
        int p=1;
        int i=1;
		while(p<=n1)
		{
			int s=3*i+2;
			if(s%n2!=0)
			{
				System.out.println(s);
                p++;
                
			}i++;
		}

    }
}
    

