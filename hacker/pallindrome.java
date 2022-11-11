public class pallindrome {
    public static void main(String[] args) {
        String s="yes i am in love with her";
        s=s.trim();
        String ans="";
        String[] str=s.split(" ");

        for(String i:str)
        {
            ans=i+" "+ans;
        }
        System.out.println(ans);
        
    }
    
}
