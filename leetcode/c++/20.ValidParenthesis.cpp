#include <iostream>
#include <stack> 
#include <bits/stdc++.h>

using namespace std;
  
class Solution{
  public:
  static bool isValid(string s){
    unordered_map<char,char> match;
    match[')'] = '(';
    match['}'] = '{';
    match[']'] = '[';
    stack<char> st;
    for(int i=0;i<s.length();i++){
      if(s[i]=='('||s[i]=='{'||s[i]=='['){
        st.push(s[i]);
        continue;
      }
      if(st.size()==0||match[s[i]]!=st.top()){
        return false;
      }
      st.pop();
    }
    if(st.size()==0){
      return true;
    }
    return false;
  }
};

int main(){
  cout<< boolalpha;
  cout<< Solution::isValid("(())")<<endl;
  return 0;
}