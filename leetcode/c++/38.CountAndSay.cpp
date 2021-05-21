#include <iostream>
#include <vector>
#include <string>

using namespace std;

string process(string s){
  string result = "";
  char curr = s[0];
  int count = 1;
  for (int i = 1; i < s.length(); i ++) {
    if (s[i] != curr) {
      result += (to_string(count) + "") + curr;
      curr = s[i];
      count = 1;
      continue;
    }
    count ++;
  }
  result += (to_string(count) + "") + curr;
  return result;
}

string countAndSay(int n){
  string result="";
  for(int i=0;i<n;i++){
    if(i==0){
      result = "1";
      continue;
    }
    result = process(result);
  }
  return result;
}

int main(){
  cout << countAndSay(4) << endl; 
  return 0;
}