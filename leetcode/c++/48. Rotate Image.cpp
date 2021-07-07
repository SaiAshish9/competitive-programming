#include <iostream>
#include <cmath>

using namespace std;

void rotate(int arr[3][3],int n){
      for(int i=0;i<n/2;i++){
        for(int j=0;j<ceil(n/2.0);j++){
          int temp = arr[i][j];
          arr[i][j] = arr[n-1-j][i];
          arr[n-1-j][i] = arr[n-1-i][n-1-j];
          arr[n-1-i][n-1-j]= arr[j][n-1-i];
          arr[j][n-1-i]=temp;  
        }  
      }
}

void display(int arr[3][3]){
  for(int i=0;i<3;i++){
    for(auto j: arr[i]){
      cout << j << " ";
    }
    cout << endl;
  }
}

int main(){
  int arr[3][3] = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
  };
  int length = sizeof(arr)/sizeof(arr[0]);
  display(arr);
  rotate(arr,length);
  cout << "#######"<< endl;
  display(arr);
  return 0;
}