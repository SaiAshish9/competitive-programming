```
1. Color first vertex with first color. 
2. Do following for remaining V-1 vertices. 
….. a) Consider the currently picked vertex and color it with the 
lowest numbered color that has not been used on any previously 
colored vertices adjacent to it. If all previously used colors 
appear on vertices adjacent to v, assign a new color to it.
```

```
Sudoku is an example of graph coloring problem where every cell
represents a vertex. There is an edge between two vertices if they 
are in same row or same column or same block.
```