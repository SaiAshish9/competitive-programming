#include <iostream>
#include <vector>

using namespace std;

int main()
{

    vector<int> x{1, 1, 0, 1, 1, 0, 0, 1};

    vector<int> y;

    for (int i = 1; i < x.size() - 1; i++)
    {
        if (x[i] == 0)
        {
            y.push_back(i);
        }
    }

    y.insert(y.begin(), 0);
    y.push_back(x.size() - 1);

    int current = 0;
    int diff = 0;
    int max = 0;

    for (int i = 0; i < y.size() - 2; i++)
    {
        diff = y[i + 2] - y[i];
        if (diff > max)
        {
            max = diff;
            current = y[i + 1];
        }
    }

    if (y.size() == 2 && x[x.size() - 1] == 0)
        current = x.size() - 1;

    cout << current << endl;

    return 0;
}