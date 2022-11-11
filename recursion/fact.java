public class fact {
    public static void main(String[] args) {
        int n=5;
        //System.out.println(fact(n));
        
        System.out.println(fact1(n,1));
    }
    // public static int fact(int n) {
    //     if(n>0)
    //     {
    //         return n*fact(n-1);
    //     }
    //     return 1;
        
    // }
    
    public static int fact1(int n,int p) {
        if(n==0)
        {
            return p;
        }
        //p=p*n;
        return fact1(n-1,n*p);
        

        
        
    }
    
    
}
