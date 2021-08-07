```
Input:
grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
         {0, 0, 5, 2, 0, 6, 3, 0, 0} }
Output:
          3 1 6 5 7 8 4 9 2
          5 2 9 1 3 4 7 6 8
          4 8 7 6 2 9 5 3 1
          2 6 3 4 1 5 9 8 7
          9 7 4 8 6 3 1 2 5
          8 5 1 7 9 2 6 4 3
          1 3 8 9 4 7 2 5 6
          6 9 2 3 5 1 8 7 4
          7 4 5 2 8 6 3 1 9
Explanation: Each row, column and 3*3 box of 
the output matrix contains unique numbers.
```

# Algorithm

```
1. Create a function that checks after assigning the current index the grid becomes unsafe or not. Keep Hashmap for a row, column and boxes. If any number has a frequency greater than 1 in the hashMap return false else return true; hashMap can be avoided by using loops.
2. Create a recursive function that takes a grid.
3. Check for any unassigned location. If present then assign a number from 1 to 9, check if assigning the number to current index makes the grid unsafe or not, if safe then recursively call the function for all safe cases from 0 to 9. if any recursive call returns true, end the loop and return true. If no recursive call returns true then return false.
4. If there is no unassigned location then return true.
```

# Source Code

```
class Sudoku
{
	public static boolean isSafe(int[][] board,
								int row, int col,
								int num)
	{
		// Row has the unique (row-clash)
		for (int d = 0; d < board.length; d++)
		{
			
			// Check if the number we are trying to
			// place is already present in
			// that row, return false;
			if (board[row][d] == num) {
				return false;
			}
		}

		// Column has the unique numbers (column-clash)
		for (int r = 0; r < board.length; r++)
		{
			
			// Check if the number
			// we are trying to
			// place is already present in
			// that column, return false;
			if (board[r][col] == num)
			{
				return false;
			}
		}

		int sqrt = (int)Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart;
			r < boxRowStart + sqrt; r++)
		{
			for (int d = boxColStart;
				d < boxColStart + sqrt; d++)
			{
				if (board[r][d] == num)
				{
					return false;
				}
			}
		}

		return true;
	}

	public static boolean solveSudoku(
		int[][] board, int n)
	{
		int row = -1;
		int col = -1;
		boolean isEmpty = true;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (board[i][j] == 0)
				{
					row = i;
					col = j;
					isEmpty = false;
					break;
				}
			}
			if (!isEmpty) {
				break;
			}
		}

		if (isEmpty)
		{
			return true;
		}

		for (int num = 1; num <= n; num++)
		{
			if (isSafe(board, row, col, num))
			{
				board[row][col] = num;
				if (solveSudoku(board, n))
				{
					return true;
				}
				else
				{
					// replace it
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static void print(
		int[][] board, int N)
	{
		
		for (int r = 0; r < N; r++)
		{
			for (int d = 0; d < N; d++)
			{
				System.out.print(board[r][d]);
				System.out.print(" ");
			}
			System.out.print("\n");

			if ((r + 1) % (int)Math.sqrt(N) == 0)
			{
				System.out.print("");
			}
		}
	}

	public static void main(String args[])
	{

		int[][] board = new int[][] {
			{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
			{ 5, 2, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 8, 7, 0, 0, 0, 0, 3, 1 },
			{ 0, 0, 3, 0, 1, 0, 0, 8, 0 },
			{ 9, 0, 0, 8, 6, 3, 0, 0, 5 },
			{ 0, 5, 0, 0, 9, 0, 6, 0, 0 },
			{ 1, 3, 0, 0, 0, 0, 2, 5, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 7, 4 },
			{ 0, 0, 5, 2, 0, 6, 3, 0, 0 }
		};
		int N = board.length;

		if (solveSudoku(board, N))
		{
			print(board, N);
		}
		else {
			System.out.println("No solution");
		}
	}
}
``` 