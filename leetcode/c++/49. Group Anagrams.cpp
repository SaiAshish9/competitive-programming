#include<iostream>
#include<vector>
#include<algorithm>
#include<string>
#include<bits/stdc++.h>

using namespace std;

vector<vector<string>> groupAnagrams(vector<string> strs){
  vector<vector<string>> result{};
  unordered_map<string,int> helper;
  for(int i=0;i<strs.size();i++){
    vector<char> tmpChar(strs[i].begin(),strs[i].end());
    sort(tmpChar.begin(),tmpChar.end());
    string tmp(tmpChar.begin(),tmpChar.end());
    if(helper.find(tmp)!=helper.end()){
      result[helper[tmp]].push_back(strs[i]);
      continue;
    }
    vector<string> curr;
    curr.push_back(strs[i]);
    result.push_back(curr);
    helper[tmp] = result.size() -1;
  }
  return result;
}

int main(){
   vector<string> dataset{"eat","tea","tan","ate","nat","bat"};
   for(auto c:groupAnagrams(dataset)){
    for(auto i:c){
      cout << i << endl;
    }
    cout << "############" << endl;
   }   
   return 0;
}