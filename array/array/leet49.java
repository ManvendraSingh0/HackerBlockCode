package array.array;

import java.util.ArrayList;
import java.util.Arrays;

public class leet49 {
    public static void main(String[] args) {
        String []arr={ "eat","tea","tan","ate","nat","bat"};
        ArrayList<String> sortedL=new ArrayList<>();
       
        ArrayList<ArrayList<String>> ans=new  ArrayList<ArrayList<String>>();
        for(int i=0;i<arr.length;i++)
        {
            char []arr1 = arr[i].toCharArray();
            Arrays.sort(arr1);
            sortedL.add(String.valueOf(arr1));
        }
        // ans.add(ans1);
        
            System.out.println(sortedL);
        for(int i=0;i<arr.length;i++)
        {   ArrayList<String> ans1=new ArrayList<>();
            ans1.add(arr[i]);
            for(int j=i+1;j<arr.length-1;j++)
            {
                
                if(sortedL.get(i).equalsIgnoreCase(sortedL.get(j)))
                {

                    int p=sortedL.indexOf(sortedL.get(j));
                    ans1.add(arr[p]);
                    
                    
                }
            }ans.add(ans1);
            
        }System.out.println(ans);

       
    }
}
