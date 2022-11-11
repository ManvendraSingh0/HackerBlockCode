public class tiles1079 {
    public static void main(String[] args) {
         String str="ABA";
         int [] freq=new int[26];
         for(int i=0;i<str.length();i++)
         {
            int idx = str.charAt(i)-'A';
            freq[idx]++;
            
         }
         for(int i:freq)
         {System.out.println(i);}
         System.out.println(Tile_possibilities(freq,""));
         
    }
    public static int Tile_possibilities(int [] freq,String ans) {
       // System.out.println(ans);
       int count=0;
        for(int i=0;i<freq.length;i++)
        {
           if(freq[i]>=1)
           {
               char ch =(char)(i+'A');
               freq[i]--;
              count += Tile_possibilities(freq, ans+ch)+1;
               freq[i]++;
           }
        }return count;
        
    }
}
