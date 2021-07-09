#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void printMaxActivities(int s[], int f[], int n)
{
    int i, j;
    cout <<"Following activities are selected "<< endl;
    i = 0;
    cout <<" "<< i;
    for (j = 1; j < n; j++)
    {
      if (s[j] >= f[i])
      {
          cout <<" " << j;
          i = j;
      }
    }
    cout << endl;
}
  
int main()
{
    int s[] =  {1, 3, 0, 5, 8, 5};
    int f[] =  {9, 4, 1, 7, 9, 9};
    int len = sizeof(f)/sizeof(f[0]);
    sort(f,f+len);
    int n = sizeof(s)/sizeof(s[0]);
    printMaxActivities(s, f, n);
    return 0;
}

// 0 3 5 5 8 1
// 1 4 7 9 9 9 