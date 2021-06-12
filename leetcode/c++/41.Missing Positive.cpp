#include<iostream>
#include<vector>

using namespace std;

int findMissingPositive(vector<int> a){
  int n = a.size();
  vector<bool> present(n);
  for(int i=0;i<n;i++){
    if(a[i]>0&&a[i]<n){
      present[a[i]] = true;
    }
  }
  for(int i=1;i<n+1;i++){
    if(!present[i]){
      return i;
    }
  }
  return n+1;
}

int main(){
  vector<int> n{0,-1,3,1};
  cout<< findMissingPositive(n)<<endl;
  return 0;
}