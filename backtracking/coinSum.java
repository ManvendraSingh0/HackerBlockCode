public class coinSum {
    public static void main(String[] args) {
        int coin[]={2,3,5,7};
        int amount= 10;
        Printanswer(coin, amount,"");
         
    }
    public static void Printanswer(int[] coin,int amount,String ans) {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++)
        {
            if(amount>=coin[i])
            {
                amount -=coin[i]; //with backtracing
                Printanswer(coin, amount, ans+coin[i]);
                // Printanswer(coin, amount-coin[i], ans+coin[i]); without backtracking
                amount +=coin[i];//with backtracing
            }
        }
        
    }

}
