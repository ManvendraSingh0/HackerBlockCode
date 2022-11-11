import java.util.Scanner;

class leetcode32
{
    public static void main(String[] args) {
        Scanner in=new 
    }
    public int searchInsert(int[] nums, int target) {
        int i=num.length;
        int mid=num[i/2];
        while(i>0)
        {
            if(mid==target)
            {
                return i/2;
            }
            else if(mid>target)
            {
                return (i/2)-1;
            }
            else
                return i/2;
            i--;
        }
    }
}