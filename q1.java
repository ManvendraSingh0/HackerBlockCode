import java.util.*;
public class q1 {
    
    public static void main(String args[]) {
        // Your Code Here
		Scanner in = new Scanner(System.in);
		int min=in.nextInt();
		int max=in.nextInt();
		int stp=in.nextInt();
		while(min<=max)
		{
			int c=(int)((5.0/9)*(min-32));
			System.out.println(min+"\t"+c);
			min=min+stp;
		}


    }
}

    

