#include <iostream>
#include <limits.h>
#include <cmath>
using namespace std;
int maxSubArray(int nums[],int length){
int currSum = 0;
int maximum = INT_MIN;
for (int i = 0; i < length; i++) {
currSum = max(currSum + nums[i], nums[i]);
maximum = max(currSum, maximum);
}
return maximum;
}
int main(){
int a[]{4,-1,2,1};
int len = sizeof(a)/sizeof(a[0]);
cout << maxSubArray(a,len)<<endl;
return 0;
}