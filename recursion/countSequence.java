public class countSequence {
    public static void main(String[] args) {
        String str= "abcd";
    System.out.println("\n"+Countpermutation(str,""));
    }
    public static int Countpermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int ans1 = Countpermutation(ques.substring(1), ans);
		int ans2 = Countpermutation(ques.substring(1), ans + ch);
		return ans1 + ans2;

	}
}
