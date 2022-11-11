package array;

public class reverseArray {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7};
        reverse(arr);       
    }
    public static void reverse(int arr[])
    {        
        for(int i=0,j=arr.length-1;i<=j;i++,j--)//two pointer approach,it dos'nt mean java support pointer,it means we have two variables one ate beggining and another at last;
        { 
            // int i=0,j=arr.length-1;
            // while(i<j)
            // {
            //     int temp=arr[i];
            //     arr[i]=arr[j];
            //     arr[j]=temp;
            //     i++,j--;

            // }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        
    }
    
}
