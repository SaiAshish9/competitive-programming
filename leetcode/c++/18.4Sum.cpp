#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<vector<int>> fourSum(vector<int> nums, int target)
{
    vector<vector<int>> result;
    if (nums.size() == 0)
    {
        return result;
    }
    sort(nums.begin(), nums.end());
    int max = nums[nums.size() - 1];
    for (int i = 0; i < nums.size(); i++)
    {
        if (i > 0 && nums[i] == nums[i - 1])
        {
            continue;
        }
        if (nums[i] + 3 * max < target)
        {
            continue;
        }
        if (nums[i] * 4 > target)
        {
            break;
        }
        for (int j = i + 1; j < nums.size(); j++)
        {
            if (j > i + 1 && nums[j] == nums[j - 1])
            {
                continue;
            }
            int start = j + 1;
            int end = nums.size() - 1;
            while (start < end)
            {
                int sum = nums[i] + nums[j] + nums[start] + nums[end];
                if (sum == target)
                {
                    vector<int> tmp;
                    tmp.push_back(nums[i]);
                    tmp.push_back(nums[j]);
                    tmp.push_back(nums[start]);
                    tmp.push_back(nums[end]);
                    result.push_back(tmp);
                    int startVal = nums[start];
                    int endVal = nums[end];
                    while (start < end && startVal == nums[start])
                    {
                        start++;
                    }
                    while (start < end && endVal == nums[end])
                    {
                        end--;
                    }
                }
                else if (sum < target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
    }
    return result;
}

int main()
{
    vector<int> v{1, 0, -1, 0, -2, 2};
    for (auto i : fourSum(v, 0))
    {
        for (auto j : i)
        {
            cout << j << " ";
        }
        cout << endl;
    };
    return 0;
}