import java.util.Scanner;
public class replacePi {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
       String s="";
       String s1="";
       for(int p=0;p<3;p++)
       {
         s=in.nextLine();
         s1="";          
        REplacePi(s, s1, 0);
       }
             
    }
    public static void REplacePi(String s,String s1,int i) {
        {
            if(s.length()-1<=i)
            {
                System.out.println(s1);
                return;
            }
            if(s.charAt(i)=='p' && s.charAt(i+1)=='i')
        {
            s1=s1+"3.14";
            i=i+1;
        }
       else{
            s1=s1+s.charAt(i);
        }
        REplacePi(s, s1, i+1);
        // i=i-1;
        }     
    }
}