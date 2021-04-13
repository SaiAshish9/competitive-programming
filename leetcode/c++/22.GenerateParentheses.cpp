#include<iostream>
#include<string>
#include<vector>

using namespace std;

class Main{
   
  public: 
  vector<string> generateParenthesis(int n){
     vector<string> result;
     process("",n,n,&result);
     return result;
  }

  void process(string prefix,int left,int right,vector<string> *result)
  {
    if(left==0&&right==0){
      result->push_back(prefix);
      return; 
    }
    if(left>0){
      process(prefix+"(",left-1,right,result);
    }
    if(left<right){
      process(prefix+")",left,right-1,result);
    }
  }
};

int main(){
  Main m;
  vector<string> vec;
  vec = m.generateParenthesis(3);
  for(auto i:vec){
    cout << i << " ";
  }
  return 0;
}