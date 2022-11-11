public class oddeven {
    public static void main(String[] args) {
        int n=5;
        odev(n);
    }
    public static void odev(int n) {
        if(n==0)
        {
            return;
        }
        if(n%2!=0)
        System.out.println(n);
        odev(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }
        
        
    }
}
