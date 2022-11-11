public class stringPallindrom {
    public static void main(String[] args) {
        String s="cbbbc";
        int n = s.length();
        int sum=0;
        for(int i = 0; i < n; i++)
    {
        char[] temp = new char[n - i + 1];
        int tempindex = 0;
         
        for(int j = i; j < n; j++)
        {
            temp[tempindex++] = s.charAt(j);
            temp[tempindex] = '\0';
            String t=String.valueOf(temp);
            for(int p=0,q=t.length()-1;p<=q;p++,q--)
            {
                if(t.charAt(p)==t.charAt(q))
                {
                    sum++;
                }
            }
        }
    }
    System.out.println(sum);
    }
}
