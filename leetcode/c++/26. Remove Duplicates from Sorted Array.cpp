#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int removeDuplicates(int nums[]){
  map<int,int> m;
  int len = *(&nums+1)-nums;
  for(int i=0;i<len;i++){
    if(m.find(nums[i])==m.end()){
       m[nums[i]]=i;
    }
  }
  for(int i=0;i<m.size();i++){
    nums[i]=m[i];
  }
  return m.size();
}

int main(){
  int r[]={0,0,1,2,2,3,4};
  cout << removeDuplicates(r) << endl;
  return 0;
}