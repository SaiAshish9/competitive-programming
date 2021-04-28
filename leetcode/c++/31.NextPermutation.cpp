#include <iostream>

using namespace std;

void nextPermutation(int nums[], int len)
{
    int paNumIndex = -1;
    for (int i = len - 1; i > 0; i--)
    {
        if (nums[i - 1] < nums[i])
        {
            paNumIndex = i - 1;
            break;
        }
    }
    if (paNumIndex != -1)
    {
        int chNumIndex = -1;
        for (int i = len - 1; i > paNumIndex; i--)
        {
            if (nums[i] > nums[paNumIndex])
            {
                chNumIndex = i;
                break;
            }
        }
        int tmp = nums[paNumIndex];
        nums[paNumIndex] = nums[chNumIndex];
        nums[chNumIndex] = tmp;
    }
    int start = paNumIndex + 1, end =
                                    len - 1;
    while (start < end)
    {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
        start++;
        end--;
    }
    for (int i = 0; i < len; i++)
    {
        cout << nums[i] << endl;
    }
}

int main()
{
    int x[] = {1, 2, 3};
    int len = sizeof(x) / sizeof(x[0]);
    nextPermutation(x, len);
    return 0;
}