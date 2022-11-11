public class fabnacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fabnacci(n));
    }
    public static int fabnacci(int n) {
        //int a=0,b=1; it works on binary tree algorithm
        if(n<=3)
        {
            return n;
        }
        int f1=fabnacci(n-1),f2=fabnacci(n-2);
        return f1+f2;
        
    }
}
