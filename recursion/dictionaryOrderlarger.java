import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class dictionaryOrderlarger {
    public static void main(String[] args) {
        String s="abc";
    List<String> arr=new ArrayList<>();
    printPermutation(s, "", arr);
    Collections.sort(arr);
    int i=arr.indexOf(s);
    for(int j=i+1;j<arr.size();j++)
    System.out.println(arr.get(j));
        
    }
    public static void printPermutation(String ques,String ans, List<String> arr) {
        
        if(ques.length()==0)
        {
            arr.add(ans);
            
            return;
        }
        for( int i=0;i<ques.length();i++)
        { 
            char ch = ques.charAt(i);
            boolean f =false;
            for(int j=i+1;j<ques.length();j++)
            {
                if(ques.charAt(j)==ch) 
                {
                    f=true;
                    break;
                }
            }
            if(f==false)
            {
            String s1= ques.substring(0, i);
            String s2= ques.substring(i+1);
            printPermutation(s1+s2, ans+ch,arr);
            }
        }
    }
}
