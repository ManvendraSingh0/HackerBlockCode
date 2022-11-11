import java.util.*;
public class leetcode2131 {
    public static void main(String[] args) {
        String[] words={"lc","cl","gg","cc","gg"};
        String p= "";
        int ans=0;
        for(int i =0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                 p=p+ words[j].charAt(1)+words[j].charAt(0);
                 System.out.println(p);
                if(words[i].equals(p)&&words[i].charAt(1)!=words[i].charAt(0))
                {System.out.println("string comp");
                    ans=ans+4;
                }
                else{
                    if(words[i].charAt(1)==words[i].charAt(0))
                    {
                        System.out.println("worsCompa");
                        ans=ans+2;
                    }
                }
                p="";
            }
        }
        System.out.println(ans);
    }
}