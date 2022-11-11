package array;

import java.util.Scanner;

public class kartikstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int k = 2;
		String s= "aabababbababaaaaaab";
        int flipA=perfectString(s,k,'a');
        int flipB=perfectString(s,k,'b');
        System.out.println(Math.max(flipA,flipB));


    }
    public static int  perfectString(String str,int k,char ch) {
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<str.length())
        {
            if(str.charAt(ei)==ch){//grow
                flip++;
            }
            while(flip>k)
            {//shrink
                if(str.charAt(si)==ch)
                {
                    flip--;
                }si++;
            }
            ans=Math.max(ans,ei-si+1);//ans
            ei++;
        }
        return ans;
    }
}
