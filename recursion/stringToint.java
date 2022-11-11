public class stringToint {
    public static void main(String[] args) {
        String s="1234";
        
System.out.println(conv(s,0,0));    }
    public static int conv(String s,int num,int p) {
        if(s.length()==p)
        {
            return num;
        }
        num=num*10+(s.charAt(p)-'0');
        return conv(s, num, p+1);

        
    }
}
