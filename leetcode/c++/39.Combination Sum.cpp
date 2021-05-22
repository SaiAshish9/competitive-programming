#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Solution{
  
  public:
  static vector<vector<int>> combinationSum(vector<int> candidates,int target){
   vector<vector<int>> result;
   if(candidates.size()==0)
   return result;
   vector<int> curr;
   sort(candidates.begin(),candidates.end());
   combinationSum(candidates,target,0,curr,result);
   return result;
  }

  static void combinationSum(vector<int>& candidates,int target,int j,vector<int>& curr,vector<vector<int>> &result){
     if(target==0){
       vector<int> temp{curr};
       result.push_back(temp);
       return;
     }
     for(int i=j;i<candidates.size();i++){
       if(target<candidates[i])
         return;
       curr.push_back(candidates[i]);
       combinationSum(candidates,target-candidates[i],i,curr,result);
       curr.pop_back();
     }
  }

};

int main(){
  vector<int> v{2,3,6,7};
  for(auto c:Solution::combinationSum(v,7)){
    for(auto i:c){
      cout << i << " ";
    }
    cout << endl;
  }
  return 0;
}