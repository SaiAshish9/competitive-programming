#include <iostream>
#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

class Main{
  
  public:
  unordered_map<char,string> initKeyboard(unordered_map<char,string> keyboard){
    keyboard['2'] = "abc";
    keyboard['3'] = "def";
    keyboard['4'] = "ghi";
    keyboard['5'] = "jkl";
    keyboard['6'] = "mno";
    keyboard['7'] = "pqrs";
    keyboard['8'] = "tuv";
    keyboard['9'] = "wxyz";
    return keyboard;
  }

  void comp(string digits,string prefix,int start,unordered_map<char,string> keyboard,vector<string> 
  *result){
    if(start==digits.length()){
      result->push_back(prefix);
      return;
    }
    string cand = keyboard[digits[start]];
    for(auto e:cand){
      comp(digits,prefix+e,start+1,keyboard,result);
    }
  }
  
  vector<string> letterCombinations(string digits){
    unordered_map<char,string> keyboard;
    keyboard = initKeyboard(keyboard);
    vector<string> res;
    if(digits.length()==0){
       return res;
    }
    this->comp(digits,"",0,keyboard,&res);
    return res; 
  }

};

int main(){
  Main m;
  for(auto i:m.letterCombinations("234")){
    cout << i << endl;
  }
  return 0;
}