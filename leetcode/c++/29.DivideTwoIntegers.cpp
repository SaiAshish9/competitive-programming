#include <iostream>
#include <bits/stdc++.h>
#include <cmath>

using namespace std;

  int divide(int dividend,int divisor){
    int result=0;
    int flag=1;
    if(divisor==0){
      return INT_MAX;
    }
    if(divisor==-1&&divisor==INT_MIN){
      return INT_MAX;
    }
    if((dividend<0 && divisor>0)||(dividend>0&&divisor<0)){
      flag = -1;
    }
    long ldd = abs((long)dividend);
    long ldr = abs((long)divisor);
    while(ldd>=ldr){
    int shift = 0;
    while(ldd>=ldr<<shift){
      shift++;
    }
    shift--;
    result+= 1 << shift;
    ldd -= ldr << shift;
    cout << "result : " << result << " , ldd: "<<  ldd << " , shift: " << shift<<endl;
    }
    return result*flag;
  }


int main(){
  cout << divide(10,3)<<endl;
  return 0;
}