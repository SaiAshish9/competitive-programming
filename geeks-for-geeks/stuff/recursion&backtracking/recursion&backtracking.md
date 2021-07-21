# Recursion

```
fn which calls itself directly or indirectly
```

# Components

```
Base condition , logic and recursive call


Recursion vs iteration difference

adv 
( shorter code )

disadv
menory req.
( local variables will be created everytime )
```

# Backtracking

```
algorithmic tech, solves incrementally
( one piece at a time )

using recursion

Types

Enumeration
Optimization
Decision


Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time 

There are three types of problems in backtracking –  

Decision Problem – In this, we search for a feasible solution.

N Queens

Optimization Problem – In this, we search for the best solution.

mainly in graphs

(Permutations)
Enumeration Problem – In this, we find all feasible solutions.

By being greedy, the algorithm matches the longest possible part. Backtracking algorithms, upon failure, keep exploring other possibilities. Such algorithms begin afresh from where they had originally started, hence they backtrack (go back to the starting point).

We all follow the process of backtracking in real life. For example, to get to an address, we go to a well-known landmark, then try the first lane, for example. If there is no success, we backtrack to the landmark again and try another lane (we may ask a passerby for help). We keep doing this until we get to the address or give up the search altogether.
```

Examples

```
Rat in a maze
N Queen
Knight Tour
```

# How to determine whether it's a backtracking problem or not

```
simply check whether a problem can be solved piece by piece or not. And check whether it can be elimnated or not once solved

exponential or factorial complexity

constraints

No guarantee of which next step will obtain the soln
```