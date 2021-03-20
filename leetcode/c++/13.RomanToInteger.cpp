#include <iostream>
#include <bits/stdc++.h>

using namespace std;

class Main{

public:
  int romanToInt(string s){
       unordered_map<char,int> helper({
         {'M',1000},
         {'D',500},
         {'C',100},
         {'L',50},
         {'X',10},
         {'V',5},
         {'I',1}
       });
       int result = 0;
       for (int i = 0; i < s.length(); i++){
          if ( i > 0 && helper[s[i]] > helper[s[i-1]]) {
          result -= 2 * helper[s[i-1]];
       }
      result += helper[s[i]];
      }
      return result;
  }

};


int main(){
  Main m;
  cout<< m.romanToInt("IV") <<endl;
  return 0;
}