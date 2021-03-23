#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>
#include <bits/stdc++.h>

using namespace std;

class Solution{
  
  public:
  int threeSum(vector<int> nums,int target){
     vector<vector<int>> result;
     sort(nums.begin(),nums.end());
     int closed = 0;
     int minimum = INT_MAX;
     if(nums.size()==0){
       return 0;
     }
     for(int i=0;i<nums.size();i++){
       if(i==0||nums[i]!=nums[i-1]){
         int start = i+1;
         int end = nums.size() - 1;
         while(start<end){
           int s = nums[i] + nums[start] + nums[end];
           if(abs(s-target)<minimum){
             minimum = abs(s-target);
             closed = s;
           }
       if(s<target){start++;}
       else{end--;}
         }
       }
     }

     return closed;
  }

};

int main(){
  Solution s;
  vector<int> l{-1, 0, 1, 2, -1, -4};
  cout << s.threeSum(l,8)<<endl;
  return 0;
}