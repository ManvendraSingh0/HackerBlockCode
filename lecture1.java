import java.util.Scanner;

public class lecture1
{
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("raam");
        System.out.println("raam");
        // post and pre increment and decrement
        int x=9;
        System.out.println(x++);//output is 9 bcz first print then increase
        int c= x + x++ + 8+ x + x--; //it calculate from left to right
        System.out.println(c);
        Scanner in =new Scanner(System.in);
        int g=in.nextInt();
        if(g>75)
        {
            System.out.println("A grade");
        }
        else if(g<75 && g>=65)
        {
            System.out.println("B grade");

        }
        else if(g<65 && g>=55)
        {
            System.out.println("C grade");

        }
        else if(g<55 && g>=45)
        {
            System.out.println("D grade");

        }
        else
        {
            System.out.println("fail");
        }

    }
}