```
Dynamic Programming is an algorithmic paradigm that solves a given complex problem by breaking it into subproblems and stores the results of subproblems to avoid computing the same results again. Following are the two main properties of a problem that suggests that the given problem can be solved using Dynamic programming.
```

# Mathematical Background

```
f(n) = f(n-1) + f(n-2), n>= 2
f(1) = 1 , f(0) = 0

f(n) = {0,1,1,2,3,5,8,13,21}
```

# Optimal Substructure

```
int fib(int n){
    if(n<=1)
    return n;
    return fib(n-1) + fib(n-2);
}
problem which has a recursive definition

For example:
Shortest Path problem

if u->v is the shortest path from u to v , then u->x will
be the shortest path from u to x and x-> v will be the
shortest path from x to v

All Pairs shortest path:
floyd-warshall
bellman-ford

Longest Path Problems doesn't consists of optimal substructure
```

# Overlapping Subproblems

```
We're calling same  function f(2) multiple times

we're doing lot of unneccesary computations
```

# Recurrence Relation

```
T(n) = T(n-1) + T(n-2) + O(1)
T(n<=1) = O(1)
T(n) = O(2^n)

n= 5 , height = 5
n= 4 , height = 4

Hence, algorithm grows at an exponential rate
```

# Solution to avoid unnecessary computations (Use Memory):

```
Do not solve the same problem again, just recall it from memory.

Two methods of storing the results in memory:

1. Memoization (Top-Down)
2. Tabulation (Bottom-Up)
```

# DP Vs Divide & Conquer

```
Similarites:
Both paradigms work by combining solutions to sub-problems

Differences:
DP is mainly used when the overlapping subproblems property is 
satisfied

That's why we build a table to avoid unnecessary computations

Examples:
Binary Search 
Fibonacci Series
```

# Perfomance

```
Time taken for calculating the 40th fibonacci number (102334155):

1. Recursive : 14s
2. Memoization : 0.17s
3. Tabulation: 0.30s
```

# Memoization

```
 Memoization (Top Down): The memoized program for a problem is similar to the recursive version with a small modification that it looks into a lookup table before computing solutions. We initialize a lookup array with all initial values as NIL. Whenever we need the solution to a subproblem, we first look into the lookup table. If the precomputed value is there then we return that value, otherwise, we calculate the value and put the result in the lookup table so that it can be reused later.
```

```
public class Fibonacci
{
final int MAX = 100;
final int NIL = -1;

int lookup[] = new int[MAX];

void _initialize()
{
	for (int i = 0; i < MAX; i++)
		lookup[i] = NIL;
}
int fib(int n)
{
	if (lookup[n] == NIL)
	{
	if (n <= 1)
		lookup[n] = n;
	else
		lookup[n] = fib(n-1) + fib(n-2);
	}
	return lookup[n];
}
public static void main(String[] args)
{
	Fibonacci f = new Fibonacci();
	int n = 40;
	f._initialize();
	System.out.println("Fibonacci number is" + " " + f.fib(n));
}
}
```

# Tabulation

```
Built the lookup table in bottom up fashion
After the table is built, simply return table[n]
```

# Algorithm

```
We begin with initializing the base values of i
Next we run a loop that iterates over the remaining values of 'i'
At every iteration, f(n) updates the ith entry in the lookup
table by combining the solutions to the previously solved subproblems
Finally, f(n) returns table[n]
```

```
public class Fibonacci
{
int fib(int n)
{
	int f[] = new int[n+1];
	f[0] = 0;
	f[1] = 1;
	for (int i = 2; i <= n; i++)
		f[i] = f[i-1] + f[i-2];
	return f[n];
}

public static void main(String[] args)
{
	Fibonacci f = new Fibonacci();
	int n = 9;
	System.out.println("Fibonacci number is" + " " + f.fib(n));
}

}
```
