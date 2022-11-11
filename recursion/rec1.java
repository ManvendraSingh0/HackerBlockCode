class rec1
{
    public static void main(String[] args) {
        int num=5;
       recnum(num);
    }
    public static int recnum( int num) {
        if(num==0)
        {
            return 1 ;
        }
        System.out.println((num)); //in decreasing mannner
        return recnum(num-1);//tell recursion
    }
}