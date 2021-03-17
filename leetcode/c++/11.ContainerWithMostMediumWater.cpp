#include <iostream>
#include <algorithm> 
#include <vector>

using namespace std;

class Solution{
  public:
  static int maxArea(vector<int>& height){
    int left{0};
    int right= height.size()-1;
    int max=0;
    while (left < right) {
      max = std::max(max,min(height[left], height[right]) * (right - left));
      if (height[left] < height[right]) {
        left ++;
      }
      else {
        right --;
      }
    }
    return max;
  }
};

int main(){
  vector<int> arr{1,2,1};
  cout<<Solution::maxArea(arr)<<endl;
  return 0;
}