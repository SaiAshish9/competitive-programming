import java.util.Set;
import java.util.HashSet;

class Main {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> helper = new HashSet<Character>();
        for (int i = 0;i < board.length; i ++) {
            helper.clear();
            for (int j = 0; j < board.length; j ++) {
                System.out.print(board[i][j]+" ");
                if (process(helper, board[i][j]) == false)
                    return false;
            }
            System.out.println("\n");
        }
        for (int j = 0;j < board.length; j ++) {
            helper.clear();
            for (int i = 0; i < board.length; i ++) {
                if (process(helper, board[i][j]) == false)
                    return false;
            }
        }
        for(int i = 0; i<9; i+= 3){
            for(int j = 0; j<9; j+= 3){
                helper.clear();
                for(int k = 0; k<9; k++){
                    if(!process(helper, board[i + k/3][ j + k%3]))
                        return false;                   
                }
            }
        }

        return true;
    }
    private static boolean process(Set<Character> helper, char c) {
        if (c == '.') {
            return true;
        }
        if (helper.contains(c)) {
            return false;
        }
        helper.add(c);
        return true;
    }
    
    public static void main(String ...s){

       char c[][] = {
         {'5','3','.','.','7','.','.','.','.'},
         {'6','.','.','1','9','5','.','.','.'},
         {'.','9','8','.','.','.','.','6','.'},
         {'8','.','.','.','6','.','.','.','3'},
         {'4','.','.','8','.','3','.','.','1'},
         {'7','.','.','.','2','.','.','.','6'},
         {'.','6','.','.','.','.','2','8','.'},
         {'.','.','.','4','1','9','.','.','5'},
         {'.','.','.','.','8','.','.','7','9'}
       };
       System.out.println(isValidSudoku(c));
    }
}