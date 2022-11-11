public class subSequence {
    public static void main(String[] args) {
        String str= "abc";
           printPermutation(str, "");
    }
    public static void printPermutation(String ques, String ans) {
        if(ques.length()==0)
        {
            System.out.print(ans + " ");
            return;
        }
        char ch=ques.charAt(0);
        printPermutation(ques.substring(1), ans);
        printPermutation(ques.substring(1), ans + ch);       
    }
}
