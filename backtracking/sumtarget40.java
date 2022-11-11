import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumtarget40 {
    public static void main(String[] args) {
        int []arr={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
       List<Integer> arr1= new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<>();
        Combination(arr, target,arr1, ans, 0);
        System.out.println(ans);
    }
    public static void Combination(int [] arr,int target, List<Integer> arr1,List<List<Integer>> ans,int idx) {

        
            if(target==0)
            {
                //System.out.println(ans);
                ans.add(new ArrayList<>(arr1));
                return;
            }
            for(int i=idx;i<arr.length;i++)
            {
                if(i!=idx && arr[i]==arr[i-1])
                {
                    continue;

                }
                if(target>=arr[i])
                { 
                    arr1.add(arr[i]);
                    Combination(arr, target-arr[i], arr1,ans, i+1);
                    arr1.remove(arr.length-1);//backtracking
                }
            }      
    }
}
