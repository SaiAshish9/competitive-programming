```
Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time.
```
```
1 present at the matrix represents rat can visit the cell
```

```
once the rat visits any other cell, mark the existing cell as 0
```

# Base Condition:

```
if(m[0][0] || m[n-1][n-1])
return 
```

```
Example

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.
```

```
A Maze is given as N*N binary matrix of blocks where source block is the upper left most block i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat starts from source and has to reach the destination. The rat can move only in two directions: forward and down. 
```

# Approach

```
Form a recursive function, which will follow a path and check if the path reaches the destination or not. If the path does not reach the destination then backtrack and try other paths. 
```

# Algorithm


```
1. Create a solution matrix, initially filled with 0’s.
2. Create a recursive function, which takes initial matrix, output matrix and position of rat (i, j).
3. if the position is out of the matrix or the position is not valid then return.
4. Mark the position output[i][j] as 1 and check if the current position is destination or not. If destination is reached print the output matrix and return.
5. Recursively call for position (i+1, j) and (i, j+1).
6. Unmark position (i, j), i.e output[i][j] = 0.
```



# Code

```
public class RatMaze {

	// Size of the maze
	static int N;

	/* A utility function to print
	solution matrix sol[N][N] */
	void printSolution(int sol[][])
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(
					" " + sol[i][j] + " ");
			System.out.println();
		}
	}

	/* A utility function to check
		if x, y is valid index for N*N maze */
	boolean isSafe(
		int maze[][], int x, int y)
	{
		// if (x, y outside maze) return false
		return (x >= 0 && x < N && y >= 0
				&& y < N && maze[x][y] == 1);
	}

	/* This function solves the Maze problem using
	Backtracking. It mainly uses solveMazeUtil()
	to solve the problem. It returns false if no
	path is possible, otherwise return true and
	prints the path in the form of 1s. Please note
	that there may be more than one solutions, this
	function prints one of the feasible solutions.*/
	boolean solveMaze(int maze[][])
	{
		int sol[][] = new int[N][N];

		if (solveMazeUtil(maze, 0, 0, sol) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}

		printSolution(sol);
		return true;
	}

	boolean solveMazeUtil(int maze[][], int x, int y,
						int sol[][])
	{
		// if (x, y is goal) return true
		if (x == N - 1 && y == N - 1
			&& maze[x][y] == 1) {
			sol[x][y] = 1;
			return true;
		}

		// Check if maze[x][y] is valid
		if (isSafe(maze, x, y) == true) {
			// Check if the current block is already part of solution path.
			if (sol[x][y] == 1)
				return false;
		
			// mark x, y as part of solution path
			sol[x][y] = 1;

			/* Move forward in x direction */
			if (solveMazeUtil(maze, x + 1, y, sol))
				return true;

			/* If moving in x direction doesn't give
			solution then Move down in y direction */
			if (solveMazeUtil(maze, x, y + 1, sol))
				return true;
		
			/* If moving in y direction doesn't give
			solution then Move backwards in x direction */
			if (solveMazeUtil(maze, x - 1, y, sol))
				return true;

			/* If moving backwards in x direction doesn't give
			solution then Move upwards in y direction */
			if (solveMazeUtil(maze, x, y - 1, sol))
				return true;

			/* If none of the above movements works then
			BACKTRACK: unmark x, y as part of solution
			path */
			sol[x][y] = 0;
			return false;
		}

		return false;
	}

	public static void main(String args[])
	{
		RatMaze rat = new RatMaze();
		int maze[][] = { { 1, 0, 0, 0 },
						{ 1, 1, 0, 1 },
						{ 0, 1, 0, 0 },
						{ 1, 1, 1, 1 } };

		N = maze.length;
		rat.solveMaze(maze);
	}
}
```
