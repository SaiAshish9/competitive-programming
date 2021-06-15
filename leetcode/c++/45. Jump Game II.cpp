#include <iostream>
#include <cmath>

using namespace std;

int jump(int nums[])
{
    int len = *(&nums + 1) - nums;
    int curr = -1, next = 0, ans = 0;
    for (int i = 0; next < len - 1; i++)
    {
        if (i > curr)
        {
            ++ans;
            curr = next;
        }
        next = max(next, nums[i] + i);
    }
    return ans;
}

int main()
{
    int n[]{2, 3, 1};
    cout << jump(n) << endl;
    return 0;
}