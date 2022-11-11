import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class substringrec {
    public static void main(String[] args) {
        
        List<String> ans = new ArrayList<>();
        generate("abab",ans);
       Collections.sort(ans);
       System.out.println(ans.get(ans.size()-1));

    }
    public static void generate(String word, List<String> ans ) {
        if (word.length() == 1) {//substring creation using recursion;
            ans.add(word);
            return;
        }else{
            ans.add(word);
            generate(word.substring(0, word.length()-1),ans); 
            generate(word.substring(1, word.length()),ans); 
        }

    }
}
