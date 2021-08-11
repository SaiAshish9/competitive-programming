#include <iostream>
#include <cmath>
using namespace std;
bool canJump(int nums[],int length){
int maximum = 0;
for (int i = 0; i < length; i++) {
if (i > maximum) {
return false;
}
maximum = max(maximum,i+nums[i]);
}
return true;
}
int main(){
int a[]{4,-1,2,1};
int len = sizeof(a)/sizeof(a[0]);
cout << boolalpha;
cout << canJump(a,len)<<endl;
return 0;
}