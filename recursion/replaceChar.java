public class replaceChar {
    public static void main(String[] args) {
        int n=102;
        String s=String.valueOf(n);
        System.out.println(replacec(s,"",0));
    }
    public static String replacec(String s,String str,int i)
     {
        
            if(str.length()==s.length())
            {
                return str;
            }
            if(s.charAt(i)!='0')
            {
                str=str+s.charAt(i);
            }
            else{
                str=str+'5';
            }
            return replacec(s, str, i+1);
        
        
    }
    
}
