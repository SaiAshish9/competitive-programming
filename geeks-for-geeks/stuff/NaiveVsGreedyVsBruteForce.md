```
Naive algorithm
An algorithm built by naive method (ie naive algorithm) is intended to provide a basic result to a problem. The naive algorithm makes no preparatory calculation and uses only the basic data of the problem.
Take for example a problem of the knapsack. The naive algorithm would be to first take objects of the smallest size until no longer able to put a new object in the bag.

For i from 1 to n
    if w [i] + w_conso ≤ W then
      x [i]: = 1
      w_conso: = w_conso + w [i]
   else
      x [i]: = 0
   End 
End
```

```
Greedy algorithm (intuitive method)
Like a naive algorithm, a greedy algorithm is built on a simple principle: during an iteration, the algorithm always makes the “best choice” decision. It is necessary to have a locally optimal choice in the objective that this choice will lead to the optimal global solution. However, the algorithm gives no guarantee that the last solution is an optimal solution.
Intuitively, we can say that to maximize the utility in the problem of the knapsack: just put the element with the greatest utility (with a size compatible with the remaining size in the bag) until there is no longer space in the bag.

For that, we will consider x and w the vectors of the choice of the object and its weight sorted in descending order of effectiveness (efficiency = utility / weight). Then the algorithm works like the naive method.

A simple example allows us to understand that this choice is not always optimal: take an object of size 1 and utility 2, and an object of size and utility equal to the size of the bag. In these conditions the first object to the greatest utility, it will be chosen first. There is no more room to place the second object. The optimal solution would be to choose only the second object in the bag.
```

```
Brute force or enumeration
Unlike a naive algorithm, this method guarantees the overall optimum, but its execution time and memory consumption can quickly exceed the limits of a computer. The principle is simple, it is necessary to enumerate all the possible solutions of the problem and to choose the best solution.
Generally, the solution tree is represented as a tree (graph). We consider the problem of the knapsack with four objects with the following parameters and a bag size of 30:

object
1
2
3
4
u_i
7
3
4
3
w_i
13
8
12
10
The tree is built by iteration: at each iteration, the new leaves represent the fact of taking or not the next object. We obtain the following binary tree:

enumeration greedy naive algorithm
The vertices in red exceed the maximum size of the bag, the vertex in purple is the optimal solution. As you can see, the number of leaves is 2 (n-1) for object n. The number of nodes generated up to the object n is 2 n -1.
```