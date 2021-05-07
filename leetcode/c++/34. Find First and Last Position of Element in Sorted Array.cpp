#include <iostream>
#include <vector>

using namespace std;

vector<int> search(int nums[],int target,int len){
  int left = 0;
  int right = len-1;
  vector<int> res(2,-1);
  bool has= false;
  while (left <= right) {
            int mid = left + (int)((right - left) / 2);
            if (nums[mid] < target) {
                left++;
            } else if (nums[mid] == target) {
                has = true;
                right--;
            } else {
                right--;
            }
        }
  if (has) {
            res[0] = left;
  }
  left = 0;
        right = len - 1;
        while (left <= right) {
            int mid = left + (int)((right - left) / 2);
            if (nums[mid] <= target) {
                left++;
            } else {
                right--;
            }
        }
        if (has) {
            res[1] = right;
  }
  return res;
}

int main(){
  int nums[]{5,7,7,8,8,10};
  int len = sizeof(nums)/sizeof(nums[0]);
  vector<int> v = search(nums,8,len);
  for(auto i:v){
    cout << i << endl;
  }
  return 0;
}