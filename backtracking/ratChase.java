import java.util.Scanner;

public class ratChase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] maze= new char[n][m];
        for(int i=0;i<maze.length;i++)
        {
            String str= in.next();
            for(int j=0;j<str.length();j++)
            {
                maze[i][j] = str.charAt(j);
            }
        }
        int [][]ans=new int[n][m];
        boolean f= false;
        HasPath(maze, 0, 0, ans,f);


    }
    public static void HasPath(char [][]maze,int cc,int cr,int[][ ]ans,boolean f)
    {
        if(cr==maze[0].length-1&& cc==maze.length-1 && maze[cr][cc] !='X')
        {
            ans[cr][cc]=1;
            display(ans);
            f=true;
            return;
        }
        if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length || maze[cr][cc]=='X')
        {
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        HasPath(maze, cc, cr-1,ans,f);//up
        HasPath(maze, cc, cr+1,ans,f);//down
        HasPath(maze, cc-1, cr,ans,f);//left
        HasPath(maze, cc+1, cr,ans,f);//right
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void display(int [][]ans) {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}