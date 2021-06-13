#include<iostream>
#include <bits/stdc++.h>

using namespace std;

string multiply(string nums1,string nums2){
  reverse(nums1.begin(),nums1.end());
  reverse(nums2.begin(),nums2.end());
  vector<int> d(nums1.length()+nums2.length());
  for (int i = 0; i < nums1.length(); i++) {
    for (int j = 0; j < nums2.length(); j++) {
      d[i + j] += (nums1[i] - '0') * (nums2[j] - '0');
    }
  }
  string result = "";
  for (int i = 0; i < d.size(); i++) {
    int digit = d[i] % 10;
    int carry = d[i] / 10;
    if (i + 1 < d.size()) {
        d[i + 1] += carry;
    }
    result = to_string(digit) + result;
  }
  int index=0;
  while (index < result.length() - 1 && result[index] == '0'){
    index++;
  }
  return result.substr(index);
}

int main(){
  cout << multiply("7","8")<< endl;
  return 0;
}