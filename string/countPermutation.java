public class countPermutation {
    public static void main(String[] args) {
        String ques="abc";
        String ans ="";
        System.out.println(countp(ques, ans));
        
    }
    private static int countp(String ques,String ans) {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
        char ch = ques.charAt(0);
        int ans1=countp(ques.substring(1), ans);
        int ans2=countp(ques.substring(1), ans+ch);
        return ans1 + ans2;
    }
}
