#include <iostream>
#include <bits/stdc++.h>
#include <string>

using namespace std;

void computeKMP(string s,int kmp[]){
  int prefixEnd = -1;
  int suffixEnd = 0;
  kmp[0] = -1;
  while(suffixEnd<s.length()-1){
      if(prefixEnd==-1||s[prefixEnd]==s[suffixEnd]){
        kmp[suffixEnd+1] = prefixEnd +1;
        prefixEnd +=1;
        suffixEnd +=1; 
      }else{
        prefixEnd = kmp[prefixEnd];
      }
  }
}

int strStr(string haystack,string needle){
  if(needle.length()==0){
    return 0;
  }
  int kmp[needle.length()];
  computeKMP(needle,kmp);
  int i=0,j=0;
  while(i<haystack.length()){
    if(j==-1){
      j=0;
      i+=1;
      continue;
    }
    if(haystack[i]==needle[j]){
      if(j==needle.length()-1){
         return i - needle.length() +1;      
      }
      i+=1;
      j+=1;
    }else{
      j=kmp[j];
    }
  }
  return -1;
}



int main(){
  cout << strStr("hello","ll") << endl;
  return 0;
}