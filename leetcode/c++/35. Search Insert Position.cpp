#include <iostream>

using namespace std;

int bs(int nums[], int start, int end, int target) {
        if (start > end) {
            return end + 1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] < target) {
            return bs(nums, mid + 1, end, target);
        }
        if (nums[mid] > target) {
            return bs(nums, start, mid - 1, target);
        }
        return mid;
}

int searchInsert(int nums[], int target,int len){
  return bs(nums, 0, len, target);
}

int main(){
  int a[]{2,3,4,5,6};
  int len = sizeof(a)/sizeof(a[0]);
  cout << searchInsert(a,5,len) << endl;
  return 0;
}