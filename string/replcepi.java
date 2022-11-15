import java.util.Scanner;

public class replcepi {
    public static void main(String[] args) {
        //String s1= "xpipippixx";
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
       while(t>0)
       {
        String s1 = in.next();
        s1=s1.replaceAll("pi", "3.14");
        System.out.println(s1);
        t--;
       }
    }
}
