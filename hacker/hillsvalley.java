import java.util.Scanner;

public class hillsvalley {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String s1= in.nextLine();
        String s2= in.nextLine();
        int p=0,q=0;
        for( int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>s2.charAt(i))
            {
                p++;
            }
            else if(s2.charAt(i)>s1.charAt(i))
            {
                q++;
            }

        }
        if(p>q)
        {
            System.out.println("+ve");
        }
        else if(q>p)
        {
            System.out.println("-ve");
        }
        else
        System.out.println(0);


    }
}
