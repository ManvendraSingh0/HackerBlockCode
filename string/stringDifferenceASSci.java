public class stringDifferenceASSci {
    public static void main(String[] args) {
        String s = "acbagf";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(i+1<s.length()){
            int a=s.charAt(i+1)-s.charAt(i);
            str = str+s.charAt(i)+a;
            }
        }
        System.out.println(str+s.charAt(s.length()-1));
    }
}
