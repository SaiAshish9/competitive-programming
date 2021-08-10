class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        boolean [] cols = new boolean[n], diag = new boolean[2*n], antiDiag = new boolean[2*n];
        backtrack(0,n,cols,diag,antiDiag);
        return count;
    }

    private void backtrack(int row, int n, boolean[] cols, boolean[]diag, boolean[]antiDiag){
        if(row == n) count++;

        for(int col = 0; col < n; col++){
            int d = row - col + n; 
            int aD = row + col;
            if(cols[col] || diag[d] || antiDiag[aD]) continue;

            cols[col] = true; diag[d] = true; antiDiag[aD] = true;
            backtrack(row + 1, n, cols, diag, antiDiag);
            cols[col] = false; diag[d] = false; antiDiag[aD] = false;

        } 
    }
}