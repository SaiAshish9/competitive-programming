#include <iostream>
#include <string>

using namespace std; 

// babad cbbd a ac

class Solution {
public:
    string static longestPalindrome(string str) {
    int n = str.size();
    int maxLength = 1, start = 0;
    for (int i = 0; i < str.length(); i++) {
        for (int j = i; j < str.length(); j++) {
            int flag = 1;
            // string(str.rbegin(),str.rend()) != str
            for (int k = 0; k < (j - i + 1) / 2; k++)
                if (str[i + k] != str[j - k])
                    flag = 0;
            if (flag && (j - i - 1) > maxLength) {
                start = i;
                maxLength = j - i - 1;
            }
        }
    }
        string ans= str.substr(start,start+maxLength);
        int count=0;
        int repeat=1;
        for(int i=1;i<ans.length();i++){
            if((int)ans[i]==(int)ans[0]){
                ++repeat;
                if(repeat%2==0)
                count=i;
            }
        }
        return ans.substr(0,count+1);
    }
};

int main() {
  cout << Solution::longestPalindrome("babad") << endl; 
  return 0;
}