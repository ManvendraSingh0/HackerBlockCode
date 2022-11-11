import java.util.*;
public class substringUsingrec {
    public static void main(String[] args) {
        String str= "babad";
       
           printSubStrings(str);
    }
    public static String printSubStrings(String str)
    {
        String s="";
     
        for (int i = 0; i < str.length(); i++) {
            String subStr="";
           
            
            for (int j = i; j < str.length(); j++) {
                subStr += str.charAt(j);
                
                if(pallindrome(subStr))
                {
                   // System.out.print(subStr +"\n");
                    if(subStr.length()>=s.length())
                    {
                        s=subStr;
                    }
                }
            }
        }return(s);
    }
public static boolean pallindrome(String s) {
    for(int i=0,j=s.length()-1;i<=j;i++,j--)
    {
        if(s.charAt(i)==s.charAt(j))
        {
            continue;
        }
        else
        {
            return false;
        }
       
    } return true;
}
}
