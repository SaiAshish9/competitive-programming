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

```
