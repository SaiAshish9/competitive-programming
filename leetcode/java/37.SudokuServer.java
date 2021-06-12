import java.io.*;
import java.util.Arrays;

class Main{

    static PrintStream ps = System.out;

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
  
    private boolean solve(char[][] board, int i, int j){
        if (i == board.length - 1 && j == board[0].length){
            return true;
        }
        if (j == board[0].length){
            i += 1;
            j = 0;
        }
        if (board[i][j] == '.'){
            for (int k = 1; k <= 9; k ++ ){
                board[i][j] = (char)((int)'0' + k);
                if (valid(board, i, j) == true){
                    boolean tmp = solve(board, i, j+1);
                    if (tmp == true){
                        return true;
                    }
                }
            }
            board[i][j] = '.';
        }
        else{
            return solve(board, i, j+1);
        }
        return false;
    }

    private boolean valid(char[][] board, int x, int y){
        int check = 0;
        for (int j = 0; j < board[0].length; j ++){
            int val = board[x][j] - '0';
            if (board[x][j] == '.'){
                continue;
            }
            if ((check & (1<<(val-1))) == 1<<(val-1)){
                return false;
            }
            else{
                check = check | 1<<(val-1);
            }
        }
        check = 0;
        for (int i = 0; i < board.length; i ++){
            int val = board[i][y] - '0';
            if (board[i][y] == '.'){
                continue;
            }
            if ((check & (1<<(val-1))) == 1<<(val-1)){
                return false;
            }
            else{
                check = check | 1<<(val-1);
            }
        }
        int ib = x/3;
        int jb = y/3;
        check = 0;
        for (int i = ib*3; i < (ib+1)*3; i ++){
            for (int j = jb*3; j < (jb+1)*3; j++){
                int val = board[i][j] - '0';
                if (board[i][j] == '.'){
                    continue;
                }
                if ((check & (1<<(val-1))) == 1<<(val-1)){
                    return false;
                }
                else{
                    check = check | 1<<(val-1);
                }
                // 1 1 1 1
                // 1 1 1 1 -> false -> second iteration bitwise operators used to mark numbers

                // 1 1 1 1
                // 0 1 1 1 -> true
            }
        }
        return true;
    }

    public void display(char[][] c,String s){
       ps.println(s);
       for(char x[]:c){
         ps.println(Arrays.toString(x));
       }
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
       Main m = new Main();
       m.display(c,"Before processing...");
       m.solveSudoku(c);
       m.display(c,"After processing...");
    }
}