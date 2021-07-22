```
Algorithms are the methodical sequence of steps which are defined to solve complex problems.

In this article, we will see the difference between two such algorithms which are backtracking and branch and bound technique.

Before getting into the differences, lets first understand each of these algorithms.

Backtracking: Backtracking is a general algorithm for finding all the solutions to some computational problems, notably constraint satisfaction problems, that incrementally builds possible candidates to the solutions and abandons a candidate as soon as it determines that the candidate cannot possibly be completed to finally become a valid solution. It is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time (by time, here, is referred to the time elapsed till reaching any level of the search tree).

Branch and Bound: Branch and bound is an algorithm design paradigm for discrete and combinatoric optimisation problems, as well as mathematical optimisation. A branch-and-bound algorithm consists of a systematic enumeration of candidate solutions. That is, the set of candidate solutions is thought of as forming a rooted tree with the full set at the root. The algorithm explores branches of this tree, which represent the subsets of the solution set. Before enumerating the candidate solutions of a branch, the branch is checked against upper and lower estimated bounds on the optimal solution and is discarded if it cannot produce a better solution than the best one found so far by the algorithm.
```

# Approach

```
Backtracking :

Backtracking is used to find all possible solutions available to a problem. When it realises that it has made a bad choice, it undoes the last choice by backing it up. It searches the state space tree until it has found a solution for the problem.

Branch and Bound:

Branch-and-Bound is used to solve optimisation problems. When it realises that it already has a better optimal solution that the pre-solution leads to, it abandons that pre-solution. It completely searches the state space tree to get optimal solution.
```

# Traversal

```
Backtracking traverses the state space tree by DFS(Depth First Search) manner.
```

```
Branch-and-Bound traverse the tree in any manner, DFS or BFS.
```

# Function

```
Backtracking involves feasibility function.

Branch-and-Bound involves a bounding function.
```

# Problems

```
Backtracking is used for solving Decision Problem

Branch-and-Bound is used for solving Optimisation Problem.
```

# Searching

```
In backtracking, the state space tree is searched until the solution is obtained.

In Branch-and-Bound as the optimum solution may be present any where in the state space tree, so the tree need to be searched completely.
```

# Efficiency

```
Backtracking is more efficient.

Branch-and-Bound is less efficient.
```

# Applications

```
Useful in solving N-Queen Problem, Sum of subset.

Useful in solving Knapsack Problem, Travelling Salesman Problem.
```
