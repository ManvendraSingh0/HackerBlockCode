public class finadbackIndex {
    public static void main(String[] args) {
        int a[]={2,3,5,4,1,3,7,3,6};
        int i=searchBack(a,a.length-1,10);
        System.out.println(i);
    }
    public static int searchBack(int arr[],int l,int item) {  
        if(l<0)
        {
            return -1;
        }
        if(arr[l]==item)
        {
            return l;
        }
        return searchBack(arr, l-1, item);   
    }
}
