#include <iostream>
#include <string>
#include <algorithm>
#include <bits/stdc++.h>

using namespace std;

class ATOI{
public:

  static string trim(const string &s){
  auto start = s.begin();
  while(start != s.end() && isspace(*start)){
     start++;
  }
  auto end = s.end();
  do{
    end--;
  }while(distance(start,end)>0 && isspace(*end));
  return string(start,end+1);
  }

  static int atoi(string s){
        string str = trim(s);
        double result = 0;
        bool isNegative = false;
        int startIndex = 0;
        if (str[0] == '+' || str[0] == '-') {
            startIndex++;
        }
        if (str[0] == '-') {
            isNegative = true;
        }
        for (int i = startIndex; i < str.length(); i++) {
            if (str[i] < '0' || str[i] > '9') {
                break;
            }
            int digitValue = (int) (str[i] - '0');
            result = result * 10 + digitValue;
        }

        if (isNegative) {
            result = -result;
        }
        if (result > INT_MAX) {
            return INT_MAX;
        }
        if (result < INT_MIN) {
            return INT_MIN;
        }

        return (int) result;
  }

};

int main() {
  cout << ATOI::atoi(" 42 Hello World! ")<<endl;
  return 0;
}