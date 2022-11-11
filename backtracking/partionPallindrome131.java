import java.util.ArrayList;
import java.util.List;

public class partionPallindrome131 {
    public static void main(String[] args) {
        String s="nitin";
       
        List<String> arr= new ArrayList<String>();
        List<List<String>> ans=new ArrayList<>();
        partition(s,arr,ans);
        System.out.println(ans);
    }
    public static void partition(String ques,List<String> arr,List<List<String>> ans2) {
        if(ques.length()==0)
        {  
           ans2.add(new ArrayList<>(arr));
            return;
        }
        for(int cut =1; cut<=ques.length();cut++)
        {
            String s1=ques.substring(0, cut);
            if(ispallindrome(s1))
            {
                arr.add(s1);
                partition(ques.substring(cut),arr,ans2);
                arr.remove(arr.size()-1);//backtracking;remove initial element
            }   
        }
    }
    public static boolean ispallindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            j--;
            i++;
        }return true;
        
    }

}
