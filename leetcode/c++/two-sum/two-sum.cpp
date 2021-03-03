#include <bits/stdc++.h>
#include <iterator> 
using namespace std;

class Solution
{
// O(n)
public:
	static void twoSum(vector<int>& nums,int target){
        unordered_map<int,int> m;
        int arr[]={};
        for(int i=0;i<nums.size();i++){
            int temp  = target - nums.at(i);
            if(m.find(temp) != m.end()){
            	cout << "[ " << m[temp] << " , " << i << " ]";
            }
            m[nums[i]] = i;
        }
	};
};

int main(int argc,char const *argv[]){

#ifndef ONLINE_JUDGE
    freopen("ip.in","r",stdin);
    freopen("op.in","w",stdout);
#endif 
   // string s;
   // getline(cin,s);
    std::vector<int> v {1,2,3};
    Solution::twoSum(v,5);
  return 0;
}
