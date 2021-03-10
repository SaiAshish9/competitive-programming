#include <iostream>
#include <string>

using namespace std;

class Solution{
  private:
  int lo,maxLen;

  void extendPalindrome(string s,int j,int k){
    while (j >= 0 && k < s.length() && s[j] ==  s[k]) {
		     j--;
		     k++;
	  }
    if(maxLen < k-j-1){
      lo = j+1;
      maxLen = k-j-1;
    }
  } 


  public:
  string longestPalindrome(string s){
    int len = s.length();
	  if (len < 2)
		    return s;
    for (int i = 0; i < len-1; i++) {
     	extendPalindrome(s, i, i); 
     	extendPalindrome(s, i, i+1); 
    }
    return s.substr(lo, lo + maxLen);
  }

};

int main(){
  Solution s;
  cout << s.longestPalindrome("bcba") <<endl;
  return 0;
}
