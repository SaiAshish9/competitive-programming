#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <numeric>      


using namespace std;

string convert(string s,int numRows){
  if(numRows==1||s.length()<numRows){
    return s;
  }

  vector<vector<char>> rows;
  int currentRow=0;
  bool reverse = false;
  string result="";

  for(int i=0;i<numRows;i++){
    vector<char> s;
    rows.push_back(s);
  }

  for(int i=0;i<s.length();i++){
    rows[currentRow].push_back(s[i]);

    if(!reverse){
        currentRow++;
    }else{
        currentRow--;
    }

    if(currentRow == numRows -1 || currentRow ==0 ){
      reverse = !reverse;
    }
  }
  
  for(auto i:rows){
   result+= accumulate(
    i.begin(),i.end(),string("")
  );
  }

  return result;
}

int main() {
  cout << convert("PAYPALISHIRING", 3)<<endl;
  return 0;
}
// PAHNAPLSIIGYIR