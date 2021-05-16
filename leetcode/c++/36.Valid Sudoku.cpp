#include<iostream>
#include<vector>
#include<bits/stdc++.h>

using namespace std;

class Solution{
   public:

   bool isValidSudoku(vector<vector<char>> board){
    unordered_set<char> helper;
    for(int i=0;i<board.size();i++){
      helper.clear();
      for(int j=0;j<board.size();j++){
      cout << board[i][j]<<" ";
      if(!this->process(&helper,board[i][j]))
        return false;
      }
      cout << endl;
    }
    for(int j=0;j<board.size();j++){
      helper.clear();
      for(int i=0;i<board.size();i++){
      if(!this->process(&helper,board[i][j]))
        return false;
      }
    }
    for(int i=0;i<9;i+=3){
      for(int j=0;j<9;j+=3){
        helper.clear();
        for(int k=0;k<9;k++){
          if(!this->process(&helper,board[i+k/3][j+k%3])){
            return false;
          }
        }
      }
    }
    return true;
   }

   bool process(unordered_set<char> *helper,char c){
    if(c == '.'){
      return true;
    }
    if(helper->count(c)){
      return false;
    }
    helper->insert(c);
    return true; 
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
  cout << boolalpha << endl; 
  cout << s.isValidSudoku(c) << endl;
  return 0;
}