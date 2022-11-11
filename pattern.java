import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("another one");
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        int st=1;
        int sp=n-1;
        int row=1;
        while(row<n)
        {
            
            int i=1;
            while(i<=sp)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=st)
            {
                if(j%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j++;
            }
            
            row++;
            st++;
            sp=sp-1;
            System.out.println();           
        }
    }
}