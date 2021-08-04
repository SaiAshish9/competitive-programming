## Greedy Algorithm : Kruskal's Algorithm

# Problem Statement

````
Construct an MST with the help of globally available edge with minimum weight which is not picked yet.
Note 
Kruskal is slower tham prim's. 
Time Complexity : O(ElogE) or (ElogV)
Greedy Approach
Sort all the edges in non-decreasing order of their weight. 
 Pick the smallest edge. Check if it forms a cycle with the spanning tree formed so far. If cycle is not formed, include this edge. Else, discard it. 
 Repeat step#2 until there are (V-1) edges in the spanning tree.
```

```
The Rank of node in tree tells us how many nodes in the tree have key values less than that node in the Tree
```