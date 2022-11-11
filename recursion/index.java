public class index {
    public static void main(String[] args) {
        int [] arr ={3,2,1,2,3};
        int t=4;
        indices(arr,t,0);
    }
    public static void indices(int [] arr,int t,int i) {
        if(arr.length-1==i)
        {
            return;
        }
        if(arr[i]==t)
        {
            System.out.print(i+" ");
        }
        indices(arr,t,i+1);
        
    }
}
