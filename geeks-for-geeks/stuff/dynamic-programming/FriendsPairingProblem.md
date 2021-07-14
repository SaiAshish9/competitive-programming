```
Given n friends, each one can remain single or can be paired up with some other friend.

Note : Each can be paired only once

Find out the total number of ways in which friends can 
remain single or can be paired up


f(n) = ways n people can remain single 
       or pair up.

For n-th person there are two choices:
1) n-th person remains single, we recur 
   for f(n - 1)
2) n-th person pairs up with any of the 
   remaining n - 1 persons. We get (n - 1) * f(n - 2)

Therefore we can recursively write f(n) as:
f(n) = f(n - 1) + (n - 1) * f(n - 2)

```

```
import java.io.*;

class GFG {

	static int countFriendsPairings(int n)
	{
		int dp[] = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i <= 2)
				dp[i] = i;
			else
				dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
		}

		return dp[n];
	}

	public static void main(String[] args)
	{
		int n = 4;
		System.out.println(countFriendsPairings(n));
	}
}
```

```
class GFG {
    static int countFriendsPairings(int n)
    {
        int a = 1, b = 2, c = 0;
        if (n <= 2) {
            return n;
        }
        for (int i = 3; i <= n; i++) {
            c = b + (i - 1) * a;
            a = b;
            b = c;
        }
        return c;
    }
 
    public static void main(String[] args)
    {
        int n = 4;
        System.out.println(countFriendsPairings(n));
    }
}
```