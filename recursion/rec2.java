public class rec2 {  //in increasing manner;;
    public static void main(String[] args) {
        int num = 5;
        recnum(num);
    }
    public static void recnum( int num) {
        if(num==0)
        {
            return  ;
        }
        System.out.println((num));
        recnum(num-1); //head recursion
        System.out.println((num));

    }
}
