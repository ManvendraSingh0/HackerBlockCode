public class second {
    
        public static void main(String[] args) {
            int n=4;
            int tq=2;
            boolean [] board = new boolean[n];
            Printanswer(board,2,0,"",0);
        }
        public static void Printanswer(boolean []board,int tq,int qpsf,String ans,int idx) {
            //qpsf=queen placed so far;;
            if(qpsf==tq)
                {
                    System.out.println(ans);
                    return;
                }
            for(int i=idx;i<board.length;i++)
            {
                
                if(board[i]==false)
                {
                    board[i]=true;
                   // qpsf=qpsf+1;
                    Printanswer(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
                    // backtracking
                    board[i]=false;
                    //qpsf=qpsf-1;
                }
            }
            
        }
    }

