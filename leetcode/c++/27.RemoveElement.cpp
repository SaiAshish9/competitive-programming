#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int removeElement(int nums[], int val) {
    int start = 0;
    int end = *(&nums+1)-nums-2;
    while (start <= end) {
        if (nums[start] != val) {
            start ++;
            continue;
        }
        if (nums[end] == val) {
            end --;
            continue;
        }
        nums[start] = nums[end];
        start ++;
        end --;
      }
      return start;
}

int main(){
  int r[]={0,0,1,2,2,3,4};
  cout << removeElement(r,0) << endl;
  return 0;
}