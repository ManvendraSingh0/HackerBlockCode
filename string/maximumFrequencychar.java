import java.util.*;

public class maximumFrequencychar {
    public static void main(String[] args) {
        String s = "";
        char [] ch1= s.toCharArray();
        Arrays.sort(ch1);
        s= new String(ch1);
        int g=0;
        String ch="";
        for(int i=0;i<s.length();i++)
        { int c=1;
           while(i+1<s.length() && s.charAt(i) == s.charAt(i+1))
           {
                i++;
                c++;
           }
           //g=c;
           if(g<c)
           {
            g=c;
            ch= Character.toString(s.charAt(i));
           }
        }
        System.out.println(ch);
    }
    
}
