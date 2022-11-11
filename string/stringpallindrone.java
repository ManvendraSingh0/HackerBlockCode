public class stringpallindrone {
    public static void main(String[] args) {
        String s="abpba";
       System.out.println(pallindrome(s));
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
