import java.util.Scanner;

public class firstNonrepeative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=1;
        while(k>0){
            k--;
        String str = "aabccd";
       int d=0;
        for(int i=0;i<str.length();i++)
        {  int c=0;
            for(int j =0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                c++;
                }
            }
            d=c;
            if(c==1)
            {
                System.out.println(str.charAt(i));
                break;
            }  
        }
        if(d!=1)
        {
            System.out.println(-1);
        }    
    }
    }
}


