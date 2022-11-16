package oops.DSA.stack;

public class Stack {
    private int [] arr;
    private int top;
    public Stack()
    {
        arr = new int[5];
        top=-1;
    }
    public Stack(int n)
    {
        arr = new int[n];
        top=-1;
    }
    public  boolean isEmpty()
    {
        return (top==-1);
    }
    public  boolean isFull()
    {
        return top==arr.length-1;
    }

    public void push(int item) throws Exception
    {
        if(isFull())
        { 
            throw new Exception("Stack is full:Stack overflow");
            //System.out.println("Stack overflow");
            
        }
        arr[++top]=item;  
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
           throw new Exception("Stack is Empty: Stack UnderFlow");
        }
        int temp=arr[top--];
        return temp;   
    }
    public int peek()
    {
       
        int temp=arr[top];
        return temp;   
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public int size()
    {
        return top+1;
    }

    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
       
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
       // st.push(60);
        System.out.println( st.pop());
        st.display();
    }
}
