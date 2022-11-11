public class aPOWb {
    public static void main(String[] args) {
        int a=4;
        int p=2;
        System.out.println(pow(a,p));
    }
    public static int pow(int a, int p) {
        if(p==0)
        {
            return 1;//one recursive is equal to one loop....
        }
        int ans=pow(a,p-1);
        return a*(ans);//head recursion
        
    }
    
}
