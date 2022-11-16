package oops.DSA;
// circular queue
public class Queue {
    private int [] arr;
    private int front=0;
    private int size=0;
    int rear=0;
    public Queue()
    {
        arr =new int[5];
    }
    public Queue(int n)
    {
        arr =new int[n];
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean isFull()
    {
        return size == arr.length;
    }
    public void Enqueue(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Overflow");
        }
        arr[(size+front)%arr.length]=item;
        size++;
    }
    public int dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Overflow");
        }
        
        int rv =arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int getFront()
    {
        int rv =arr[front];
        return rv;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        System.out.println(q.dequeue());
        q.display();
    }
}
