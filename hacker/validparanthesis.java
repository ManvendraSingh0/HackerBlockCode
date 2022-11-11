import java.util.Scanner;
import java.util.Stack;
public class validparanthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        Stack<Character> stack = new Stack<>();
        char[] s1=s.toCharArray();
        for(char i:s1)
        {
            if( i=='{' || i=='(' || i=='[')
            {
                stack.push(i);
            }
            else{
                if(stack.isEmpty())
                {
                    System.out.println(false);return;
                }
                else
                {
                    char t=stack.peek();
                    if(i=='}'&&t=='{'||i==']'&&t=='['||i==')'&&t=='(')
                    {
                            stack.pop();
                    }
                    else{
                        System.out.println(false);return;
                    }
                }
            }
        }System.out.println(stack.isEmpty());
    } 
}