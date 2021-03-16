#include <iostream>

using namespace std;

class Solution
{
public:
    static bool isMatch(string s, string p)
    {
        int rows = 0, columns = 0;
        bool dp[rows][columns];
        dp[0][0] = true;

        for (int i = 2; i < columns + 1; i++)
        {
            if (p[i - 1] == '*')
            {
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i < rows + 1; i++)
        {
            for (int j = 1; j < columns + 1; j++)
            {
                if (s[i - 1] == p[j - 1] || p[j - 1] == '.')
                {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else if (j > 1 && p[j - 1] == '*')
                {
                    dp[i][j] = dp[i][j - 2];
                    if (p[j - 2] == '.' || p[j - 2] == s[i - 1])
                    {
                        dp[i][j] = dp[i][j] or dp[i - 1][j];
                    }
                }
            }
        }

        return dp[rows][columns];
    }
};

int main()
{
    cout << boolalpha;
    cout << Solution::isMatch("aab", "c*a*b") << endl;
}