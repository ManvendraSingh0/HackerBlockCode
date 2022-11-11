import java.util.*;
public class toggleCase {
    public static void main(String[] args) {
        String s="MaDarchoDRitU";
        String str="";
        
        for(int i=0;i<s.length();i++)
        {
            char p=s.charAt(i);
            if(Character.isUpperCase(p))
            {
                str=str+Character.toString(Character.toLowerCase(p));
            }
            else{
                str=str+Character.toString(Character.toUpperCase(p));
            }
        }
        System.out.println(str);
       char p='a'-1;
       System.out.println(p);
    }
}
