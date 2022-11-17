package oops.stack;

public class dynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception
    {
        if(isFull())
        {
            int [] a = new int[2*arr.length];
            for(int i=0;i<arr.length;i++)
            {
                a[i]=arr[i];
            }
            arr=a;
        }
        super.push(item);
    }
    
    public static void main(String[] args) throws Exception {
        dynamicStack ds= new dynamicStack();
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.display();
        System.out.println("\npop:"+ds.pop());
        
    }
    
}
