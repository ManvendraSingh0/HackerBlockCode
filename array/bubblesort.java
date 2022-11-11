import java.util.Scanner;

// import java.util.Scanner;

public class bubblesort {
    public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]= new int[n];
		int p=0;
		while(p<n)
		{
			arr[p]=in.nextInt();
			p++;
		}
		for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

    }
    
}