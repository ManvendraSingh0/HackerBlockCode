public class oddEvenChar {
    public static void main(String[] args) {
        String s= "abcg";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            
            
            if(i%2==0)
            {
                
                str=str+ Character.toString((s.charAt(i)+1));
            }
            else{
                str=str+ Character.toString((s.charAt(i)-1));
                
            }
        }System.out.println(s.charAt(1)+1);
    }
}
