public class stringcomperssion {
    public static void main(String[] args) {
        String s ="aaabbccds";
        String str="";
        //int g=0;
        for(int i=0;i<s.length();i++)
        {  int c=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                i++;
                c++;
            }
            if(c>1)
            str=str+s.charAt(i)+c;
            else{
                str=str+s.charAt(i);
            }
            
        }
        System.out.println(str);
    }
}
