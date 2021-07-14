# Egg Dropping Puzzle

```
Given n eggs and k floors, decide floors from which eggs should be
dropped such that total number of attempts are minimized.

Egg may or may not break at each attempt
```

# Examples

```
Example 1 : Given 1 egg and 10 floors, what is min attempt? (worst case)

Ans 1 : 10

Example 2 : Given 10 eggs and 1 floor , what is min attempt? (worst case)

Ans 2 : 1

```

# Optimal Substructure

```
When we drop an egg from a floor x, there can be two cases (1) The egg breaks (2) The egg doesn’t break. 
 
If the egg breaks after dropping from ‘xth’ floor, then we only need to check for floors lower than ‘x’ with remaining eggs as some floor should exist lower than ‘x’ in which egg would not break; so the problem reduces to x-1 floors and n-1 eggs.

If the egg doesn’t break after dropping from the ‘xth’ floor, then we only need to check for floors higher than ‘x’; so the problem reduces to ‘k-x’ floors and n eggs.
Since we need to minimize the number of trials in worst case, we take the maximum of two cases. We consider the max of above two cases for every floor and choose the floor which yields minimum number of trials. 
```

```
k ==> Number of floors 
n ==> Number of Eggs 
eggDrop(n, k) ==> Minimum number of trials needed to find the critical 
floor in worst case.
eggDrop(n, k) = 1 + min{max(eggDrop(n – 1, x – 1), eggDrop(n, k – x)), where x is in {1, 2, …, k}}
```

```
public class GFG {
	static int eggDrop(int n, int k){
		if (k == 1 || k == 0)
			return k;

		if (n == 1)
			return k;

		int min = Integer.MAX_VALUE;
		int x, res;

		for (x = 1; x <= k; x++) {
			res = Math.max(eggDrop(n - 1, x - 1),
						eggDrop(n, k - x));
			if (res < min)
				min = res;
		}

		return min + 1;
	}

	public static void main(String args[])
	{
		int n = 2, k = 10;
		System.out.print("Minimum number of "
						+ "trials in worst case with "
						+ n + " eggs and " + k
						+ " floors is " + eggDrop(n, k));
	}
}
```

```
Dynamic Programming.
In this approach, we work on the same idea as described above neglecting the case of calculating the answers to sub-problems again and again.. The approach will be to make a table which will store the results of sub-problems so that to solve a sub-problem, it would only require a look-up from the table which will take constant time, which earlier took exponential time.

(1 + max( DP[i-1][j-1], DP[i][j-x] )).

i => Number of eggs 
j => Number of floors 
```

```
class EggDrop {

	static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}

	static int eggDrop(int n, int k)
	{
		int eggFloor[][] = new int[n + 1][k + 1];
		int res;
		int i, j, x;

		// We need one trial for one floor and
		// 0 trials for 0 floors
		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}

		// We always need j trials for one egg
		// and j floors.
		for (j = 1; j <= k; j++)
			eggFloor[1][j] = j;

		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for (x = 1; x <= j; x++) {
					res = 1 + max(
								eggFloor[i - 1][x - 1],
								eggFloor[i][j - x]);
					if (res < eggFloor[i][j])
						eggFloor[i][j] = res;
				}
			}
		}

		return eggFloor[n][k];
	}

	public static void main(String args[])
	{
		int n = 2, k = 10;
		System.out.println("Minimum number of trials in worst"
						+ " case with "
						+ n + " eggs and "
						+ k + " floors is " + eggDrop(n, k));
	}
}
```