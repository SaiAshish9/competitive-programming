#include <iostream>
#include <vector>

using namespace std;

class Solution{
  public:
  void solveSudoku(vector<vector<char>> &board){
    solve(board,0,0);
  }
  bool solve(vector<vector<char>> &board,int i,int j){
       if (i == board.size() - 1 && j == board[0].size()){
            return true;
        }
        if (j == board[0].size()){
            i += 1;
            j = 0;
        }
        if (board[i][j] == '.'){
            for (int k = 1; k <= 9; k ++ ){
                board[i][j] = (char)((int)'0' + k);
                if (valid(board, i, j)){
                    bool tmp = solve(board, i, j+1);
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
  
  bool valid(vector<vector<char>> &board,int x,int y){
      int check = 0;
        for (int j = 0; j < board[0].size(); j ++){
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
        for (int i = 0; i < board.size(); i ++){
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
            }
        }
        return true;
  }

  void display(vector<vector<char>> &c){
    for(auto i:c){
      for(auto x:i){
        cout << x << " ";
      }
      cout << endl;
    }
  }

};

int main(){
  Solution s;
  vector<vector<char>> c;
  c = {
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
  s.solveSudoku(c);
  s.display(c);
  return 0;
}