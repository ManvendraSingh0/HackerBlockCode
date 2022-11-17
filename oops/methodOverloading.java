package oops;

public class methodOverloading {
    public static void main(String[] args) {
        String
    }
    public static int add(int a , int b) {
        return a+b;
    }
    public static int add(int a, int b ,int c) {
        return a+b+c;
    }
    public static int add(int a, int b ,float c) {
        return (int)(a+b+c);
    }
    public static int add(int... a) {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum +=a[i];
        }return sum;
        
    }
}
