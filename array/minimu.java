package array;

public class minimu {
    public static void main(String[] args) {
        int arr []={1,5,-13,-2,5};
        minel(arr);
        
    }
    public static void minel(int arr[])
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        { 
            if(temp>arr[i])
            {                
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
}
