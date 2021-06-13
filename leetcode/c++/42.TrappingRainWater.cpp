#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int trap(int height[])
{
    int length = *(&height + 1) - height;
    int left[length];
    int right[length];
    int maximum = height[0];
    left[0] = height[0];
    bool check = false;
    int water = 0;
    if (length == 0)
    {
        check = true;
    }
    if (!check)
    {
        for (int i = 1; i < length; i++)
        {
            if (height[i] > maximum)
            {
                maximum = height[i];
            }
            left[i] = maximum;
        }
        maximum = height[length - 1];
        right[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--)
        {
            if (height[i] > maximum)
            {
                maximum = height[i];
            }
            right[i] = maximum;
        }
        for (int i = 0; i < length; i++)
        {
            water += min(left[i], right[i]) - height[i];
        }
    }
    return water;
}

int main()
{
    int height[]{4, 2, 0, 3, 2, 5};
    cout << trap(height) << endl;
    return 0;
}