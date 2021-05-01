#include <iostream>

using namespace std;

int search(int nums[], int target, int len)
{
    int start = 0;
    int end = len - 1;
    while (start <= end)
    {
        int mid = (start + end) / 2;
        if (nums[mid] == target)
        {
            return mid;
        }
        if (nums[start] <= nums[mid])
        {
            if (nums[start] <= target && target < nums[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        else
        {
            if (nums[mid] < target && target <= nums[end])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
    }
    return -1;
}

int main()
{
    int nums[]{4, 5, 6, 0, 1, 2};
    int len = sizeof(nums) / sizeof(nums[0]);
    cout << search(nums, 0, len) << endl;
    return 0;
}