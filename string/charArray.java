import java.util.*;
public class charArray {
    public static void main(String[] args) {
        String st="aaabbccdddeeep";
        char [] ch=st.toCharArray();
        int p=0;
        int c=0;
        //int t=0;
        String str="";
        for(int i=0;i<st.length();i++)
        {
        
         if(st.charAt(i)==ch[p])
        {
            c++;
            
        }
        else if(st.charAt(i)==ch[p] || i==st.length()-2){
            c++;
            //p=i;
            str=str+st.charAt(p)+c; 
     
        }
        else
        {
            
            
            str=str+st.charAt(p)+c;
            p=i+1;
            c=1;
            
           
        }
    }
    System.out.println(str);
        
    }
}
