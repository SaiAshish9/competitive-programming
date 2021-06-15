#include <iostream>

using namespace std;

bool isMatch(string s,string p){
  bool dp[s.length()+1][p.length()+1];
  dp[0][0] = true;
  for (int j = 1; j <= p.length(); j ++) {
    if (p[j - 1] == '*') {
      dp[0][j] = dp[0][j - 1];
    }
  }
  for (int i = 1; i < s.length() + 1; i ++) {
    for (int j = 1; j < p.length() + 1; j ++) {
      if (p[j - 1] == '?' || p[j - 1] == s[i - 1]) {
        dp[i][j] = dp[i][j] || dp[i - 1][j - 1];
      }
      else if (p[j - 1] == '*') {
          dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
        }
      }
  }
  return dp[s.length()][p.length()];
}

int main(){
  cout << boolalpha;
  cout << isMatch("aa","a")<<endl;
  return 0;
}