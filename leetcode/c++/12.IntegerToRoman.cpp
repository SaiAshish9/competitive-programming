#include <iostream>

using namespace std;

class Solution{
  public:
  string intToRoman(int num){
    int base[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    string chars[] = {"M","CM","D","CD","C","XC","L","XL","X","IX", "V", "IV", "I"};
    string result="";
    for (int i = 0; i < sizeof(base)/sizeof(base[0]) ; i ++) {
            if (num / base[i] > 0) {
                for (int j = 0; j < num/base[i]; j ++) {
                    result = result + chars[i];
                }
                num = num - (num / base[i]) * base[i];
            }
    }
    return result;
  }
};

int main(){
  Solution s1;
  cout<<s1.intToRoman(44)<<endl;
  return 0;
}