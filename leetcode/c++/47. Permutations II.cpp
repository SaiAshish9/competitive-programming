#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void dfs(vector<int> &nums, vector<vector<int>> &res, vector<int> &curr, vector<bool> &visited)
{
    if (curr.size() == nums.size())
    {
        res.push_back(curr);
        return;
    }
    for (int i = 0; i < nums.size(); i++)
    {
        if (visited[i] == true)
        {
            continue;
        }
        if (i == 0 || nums[i] != nums[i - 1] || (nums[i] == nums[i - 1] && visited[i - 1] == true))
        {
            visited[i] = true;
            curr.push_back(nums[i]);
            dfs(nums, res, curr, visited);
            curr.pop_back();
            visited[i] = false;
        }
    }
}

vector<vector<int>> permute(vector<int> &nums)
{
    vector<vector<int>> res;
    vector<bool> visited;
    if (nums.size() == 0)
    {
        return res;
    }
    sort(nums.begin(), nums.end());
    vector<int> temp;
    dfs(nums, res, temp, visited);
    return res;
}

int main()
{
    vector<int> nums{1, 1, 2};
    for (auto c : permute(nums))
    {
        cout << "[ ";
        for (auto i : c)
        {
            cout << i << " ,";
        }
        cout << " ]" << endl;
    }
    return 0;
}