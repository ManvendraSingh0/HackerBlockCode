package array;
// java is called call by valuen
import java.util.Scanner;

public class arrainput {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }display(arr);
    }
    public static void display(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
