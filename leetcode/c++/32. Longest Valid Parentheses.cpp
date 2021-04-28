#include <iostream>
#include <string>
#include <stack>
#include <cmath>

using namespace std;

int longestValidParentheses(string s){
    int maxans=0;
    stack<int> stack;
    for(int i=0;i<s.length();i++){
      if(s[i]=='('){
        stack.push(i);
      }else{
        stack.pop();
        if(stack.empty()){
          stack.push(i);
        }else{
          maxans = max(maxans,i-stack.top());
        }
      }
    }
    return maxans;
}

int main(){
  cout << longestValidParentheses("(()()")<<endl;
  return 0;
}