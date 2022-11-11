public class dicesum {
    public static void main(String[] args) {
        int n =4;
        // String s="raam";
        // String s1=s.substring(0,0);
        // System.out.println(s1);
        printPath(0, n, "");
    }
    public static void printPath(int curr,int end,String ans) {
        if(curr==end)
        {
            System.out.println(ans);
            return;
        }
        if(curr > end)
        {
            return;
        }
        // printPath(curr+1, end, ans+1);
        // printPath(curr+2, end, ans+2);
        // printPath(curr+3, end, ans+3);
        for(int dice =1;dice<=3;dice++)
        {
            printPath(curr+dice, end, ans+dice);
        }
        
    }
}
