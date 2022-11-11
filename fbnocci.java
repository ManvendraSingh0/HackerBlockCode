import java.util.Scanner;

public class fbnocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0,b=1;
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
           
            //int c=a+b;
            a=a+b;
            b=a-b;
        } System.out.println(a);


    }
}
