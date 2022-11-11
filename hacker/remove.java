public class remove {
    public static void main(String[] args) {
        int []num={3,2,2,3};

        int val=2,k=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==val)
            {
                k++;
            }

        }System.out.println(num.length-k);

    }
    
}
