public class headtell {
    public static void main(String[] args) {
        int n=3;
        HTperm(n,"");

    }
    public static void HTperm(int n,String ans) {
        if(0==n)
        {
            System.out.println(ans);
            return;
        }
        if( !ans.endsWith("H"))
        {
            HTperm(n-1, ans+"H");
        }
        
        HTperm(n-1, ans+"T");
    }
}
