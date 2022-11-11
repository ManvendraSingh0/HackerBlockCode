package array;

public class binarySearch {
    public static void main(String[] args) {
        int arr []={2,3,4,5,6,7,8,9,11,16,18};
        int item=5;
        int a=binarySearch1(arr,item);
        System.out.println(a);
        
        
    }
    public static int binarySearch1(int arr[],int item)
    {
        int si=0;
        int ei=arr.length -1;
       
        
        while(si<=ei){
            int mid=(si+ei)/2;
        if(arr[mid]==item)
        {
            return mid;
        }
        else if(arr[mid]>item)
        {
            ei=mid-1;
        }
        else
        {
            si=mid+1;
        }
    }
        return -1;

    }
}
