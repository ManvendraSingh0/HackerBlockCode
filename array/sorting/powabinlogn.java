package array.sorting;

public class powabinlogn {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(pow(a, b));
    }
    public static int pow(int a , int b) {
        if(b==0)
        {return 1;}
        int ans= pow(a,b/2);
        if(b%2==0)
        {
            ans=ans*2;
        }
        return ans*ans*b;
        
    }
}
