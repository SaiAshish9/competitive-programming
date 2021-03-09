#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    static double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
         vector<int> vec(nums1);
         vec.insert(vec.begin(),nums2.begin(),nums2.end());
         sort(vec.begin(),vec.end());
         double median;
         int mid; 
         if(vec.size()==1){
           return vec[0];
         }
         mid = (int) vec.size()/2.0;
         if(vec.size()%2!=0){
            median = vec[mid];
         }else{
            median = (vec[mid-1]+vec[mid])/2.0;
            cout << (vec[mid-1]+vec[mid])<<endl;
         }
         return median;
    }
};

int main() {
  vector<int> v1{};
  vector<int> v2{2,3};
  cout<<"Median : "<<Solution::findMedianSortedArrays(v1,v2)<<endl;
  return 0;
}