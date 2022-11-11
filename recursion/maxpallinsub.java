public class maxpallinsub {
   
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome(str));
    }
    
        public static String longestPalindrome(String s) {
            if(s.length()<=1)return s;
          int start=0;
            int end=0;
            int n=s.length();
            int endpoint=1;
            for(int i=0;i<n-1;i++){
                int l=i;
                int r=i+1;
                while(l>=0&&r<n){
                    if(s.charAt(l)==s.charAt(r)){
                        l--;
                        r++;
                    }
                    else
                        break;
                }
                int len=r-l-1;
                if(endpoint<len){
                    endpoint=len;
                    start=l+1;
                    end=r-1;
                }
            }
            for(int i=1;i<n-1;i++){
                int l=i-1;
                int r=i+1;
                while(l>=0&&r<n){
                    if(s.charAt(l)==s.charAt(r)){
                        l--;
                        r++;
                    }
                    else
                        break;
                }
                int len=r-l-1;
                if(endpoint<len){
                    endpoint=len;
                    start=l+1;
                    end=r-1;
                    //end=end+1;
                }
            }
            return s.substring(start,end+1);
        }
    }

