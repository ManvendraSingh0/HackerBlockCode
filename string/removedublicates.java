//import java.util.ArrayList;

public class removedublicates {
    public static void main(String[] args) {
        String st= "aabccdeefa";
        String str="";
        for(int i=0;i<st.length();i++)
        {
          //int c=1;
          while(i+1<st.length() && st.charAt(i)==st.charAt(i+1))
          {
              i++;
              //c++;
          }
          str=str+st.charAt(i);
        }
        System.out.println(str);
    }
}

6   `       o