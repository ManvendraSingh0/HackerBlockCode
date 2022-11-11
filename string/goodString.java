import java.util.Scanner;

public class goodString {
    public static void main(String args[]) {
        // Your Code Here
		Scanner in =  new Scanner(System.in);
		String str= in.next();
		str=str.toLowerCase();
		int c=0,ans=0,ans2=0;
		for(int i=0;i<str.length();i++)
		{
            System.out.println(str.charAt(i));
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				c++;
                ans2++;

			}
			else
			{
				ans=Math.max(c,ans);
				c=0;
			}

		}
		System.out.println(Math.max(ans2,ans));
    }
}
