import java.util.Stack;

public class stackReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
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
    public static void reverse(Stack<Integer> st)
    {
        if(st.isEmpty()) {
			
			return;
		}
		int i1 = st.pop();
        reverse(st);
		Insert(st,i1);
    }
}
