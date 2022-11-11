import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numberNlexo {
    public static void main(String[] args) {
        int n =13;
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            String s=String.valueOf(i+1);
            arr[i]=s;
        }
        Arrays.sort(arr);
        // for(String j:arr)
        // {
        //     System.out.print(j+" ");
        // }
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=Integer.valueOf(arr[i]);
            ans.add(a);
        }
        System.out.println(ans);
    }
}
