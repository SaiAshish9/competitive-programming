# Dial's Algorithm

```
Dijkstra’s shortest path algorithm runs in O(Elog V) time when implemented with adjacency list representation (

Input : Source = 0, Maximum Weight W = 14
Output : 
     Vertex   Distance from Source
        0                0
        1                4
        2                12
        3                19
        4                21
        5                11
        6                9
        7                8
        8                14
Can we optimize Dijkstra’s shortest path algorithm to work better than O(E log V) if maximum weight is small (or range of edge weights is small)?
For example, in the above diagram, maximum weight is 14. Many a times the range of weights on edges in is in small range (i.e. all edge weight can be mapped to 0, 1, 2.. w where w is a small number). In that case, Dijkstra’s algorithm can be modified by using different data structure, buckets, which is called dial implementation of dijkstra’s algorithm. time complexity is O(E + WV) where W is maximum weight on any edge of graph, so we can see that, if W is small then this implementation runs much faster than traditional algorithm. Following are important observations.

Maximum distance between any two node can be at max w(V – 1) (w is maximum edge weight and we can have at max V-1 edges between two vertices).
In Dijkstra algorithm, distances are finalized in non-decreasing, i.e., distance of the closer (to given source) vertices is finalized before the distant vertices.

```