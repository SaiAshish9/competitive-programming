#include <iostream>

using namespace std;

class Solution {
    public:
     static bool isPalindrome(int x) {
        int n=x;
        if(x<0){
          return false;
        }
        int rev=0;
        while(n>0){
          rev= rev*10 + n%10;
          n/=10;
        }
        if(x==rev){
          return true;
        }else{
          return false;
        }
    }
};

int main() {
  cout << boolalpha;
  cout << Solution::isPalindrome(-121) <<endl;
  return 0;
}