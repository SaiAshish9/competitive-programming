## Greedy Algorithm

```
an algorithmic paradigm that follows the problem solving 
approach of making the locally optimal choice at each stage 
with the each stage with the hope of finding a global optimum  
```

```
Pros: simple,easy to implement,run fast 
```

```
Cons: Very often they don't provide a globally optimum solution
```

```
e.g. ->

3
4 7
6 20 9 11

3+7+11 = 21
<
3+4+20 = 27

We can conclude that:
making locally optimum greedy choices don't always give us the global optimum.

```

```
Problems on greedy approach work has two properties:

1. Greedy - choice property -> A global optimum can be arrived by selecting local optimum

2. Optimal Substructure ->  An optimal solution to the problem contains optimal solution to subproblems
```

```
Applications:
Kruskal 
Prims minimum spanning tree
Dijkstra
Fractional Knapsack
job sequencing
activity selection
huffman coding
```