#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    static string lcp(vector<string> s)
    {
        if (s.size() == 0)
        {
            return "";
        }
        string prefix = s[0];
        for (int i = 0; i < s.size(); i++)
        {
            for (int j = 0; j < prefix.length(); j++)
            {
                if (j == s[i].length() || prefix[j] != s[i][j])
                {
                    prefix = prefix.substr(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
};

int main()
{
    Solution s;
    vector<string> l{"flower", "flow", "flight"};
    cout << s.lcp(l) << endl;
    return 0;
}