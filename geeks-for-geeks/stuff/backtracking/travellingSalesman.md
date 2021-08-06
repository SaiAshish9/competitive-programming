```
Given a set of cities and distance between every pair of cities, the problem is to find the shortest possible route that visits every city exactly once and returns back to the starting point.

Approach

1. Consider city 1 (let say 0th node) as the starting and ending point. Since route is cyclic, we can consider any point as starting point.

2. Start traversing from the source to its adjacent nodes in dfs manner.

3. Calculate cost of every traversal and keep track of minimum cost and keep on updating the value of minimum cost stored value.
Return the permutation with minimum cost.

Java Solution

class TSP
{

	static int tsp(int[][] graph, boolean[] v,
				int currPos, int n,
				int count, int cost, int ans)
	{

		if (count == n && graph[currPos][0] > 0)
		{
			ans = Math.min(ans, cost + graph[currPos][0]);
			return ans;
		}

		for (int i = 0; i < n; i++)
		{
			if (v[i] == false && graph[currPos][i] > 0)
			{

				v[i] = true;
				ans = tsp(graph, v, i, n, count + 1,
						cost + graph[currPos][i], ans);

				v[i] = false;
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{

		int n = 4;

		int[][] graph = {{0, 10, 15, 20},
						{10, 0, 35, 25},
						{15, 35, 0, 30},
						{20, 25, 30, 0}};
		boolean[] v = new boolean[n];

		v[0] = true;
		int ans = Integer.MAX_VALUE;

		ans = tsp(graph, v, 0, n, 1, 0, ans);

		System.out.println(ans);
	}
}
```
