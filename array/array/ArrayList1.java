package array;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(0, 100);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.set(1, -90));
        System.out.println(list);
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

        System.out.println("\n"+list);
        for(int i:list)
        {//enhence for loop;
            System.out.print(i+" ");
        }
    }    
}
