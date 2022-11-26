import java.util.Stack;

public class insertDown {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Insert(st,-3);
        System.out.println(st);
    }
    public static void Insert(Stack<Integer> st,int val) {
		if(st.isEmpty()) {
			st.push(val);
			return;
		}
		int i1 = st.pop();
		Insert(st,val);
		st.push(i1);	
	}
}
