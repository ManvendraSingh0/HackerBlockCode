public class coinSum {
    static int t=0;
    public static void main(String[] args) {
        int coin[]={1,2,5};
        int amount= 5;
       
        Printanswer(coin, amount,"");
        System.out.println("total no. of coins formed:"+t);
         
    }
    public static void Printanswer(int[] coin,int amount,String ans) {
        if(amount==0)
        {
            t++;//no of coins formed
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
