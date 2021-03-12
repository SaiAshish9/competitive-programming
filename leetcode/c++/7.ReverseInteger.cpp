#include <iostream>
#include <bits/stdc++.h>

using namespace std;

class Solution{
  public:
  int static reverse(int x){
   long n=x;
    long ans=0;
    int sign =1;
    if(x<0) {
      n*=-1;
      sign = -1;
      };
    while(n>0){
      ans= ans*10 + n%10;
      n/=10;
    }
    if(ans > INT_MAX){
        return 0;
    }     
    return (int)sign*ans;
  }
};

int main(){
  cout<<Solution::reverse(-123)<<endl;
  return 0;
}