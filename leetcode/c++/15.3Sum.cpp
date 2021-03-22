#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution{
  
  public:
  vector<vector<int>> threeSum(vector<int> nums){
     vector<vector<int>> result;
     sort(nums.begin(),nums.end());
     for(int i=0;i<nums.size();i++){
       if(i==0||nums[i]!=nums[i-1]){
         int start = i+1;
         int end = nums.size() - 1;
         while(start<end){
           int s = nums[i] + nums[start] + nums[end];
           if(s==0){
             vector<int> temp;
             temp.insert(temp.end(),{nums[i],nums[start],nums[end]});
             result.push_back(temp);
             int startVal = nums[start];
             int endVal = nums[end];
             while(start < end && startVal == nums[start]){
                   start++;   
             }
             while(end > start && endVal == nums[end]){
                  end--;
             }
           }else if(s<0){start++;}
       else{end--;}
         }
       }
     }
     return result;
  }

};

int main(){
  Solution s;
  vector<int> l{-1, 0, 1, 2, -1, -4};
  for(auto v:s.threeSum(l)){
    cout << "[ ";
    for(auto i:v){
      cout << i <<" , " ;
    }
    cout << " ]" << endl;
  }
  return 0;
}