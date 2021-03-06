#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string longest(string str){

unordered_map<char,int> pos;

int start,st=0,current,max=0;


// start represent's current location where new substring is to be inspected.

// st represent's current location

// current represent's present distance 

int i;

for(i=0;i<str.length();i++){
   if(pos.find(str[i]) == pos.end()){
      pos[str[i]]=i;
      // if it's not existing
   }else{
      if(pos[str[i]] >= st){
        current = i - st;
        if(max<current){
          max=current;
          start=st;
        }
        st = pos[str[i]] + 1;   
      }
      pos[str[i]] = i;
   }
}
if (max < i - st) {
  max = i - st;
  start = st;
}
return str.substr(start,max);
}

int main() {
  string str="abcdbabsbd";
  cout<< "Answer :" << endl << longest(str)<<endl;
  return 0;
}