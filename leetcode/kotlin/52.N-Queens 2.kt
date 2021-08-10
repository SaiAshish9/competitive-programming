internal class Solution {
    var count = 0
    fun totalNQueens(n: Int): Int {
        val cols = BooleanArray(n)
        val diag = BooleanArray(2 * n)
        val antiDiag = BooleanArray(2 * n)
        backtrack(0, n, cols, diag, antiDiag)
        return count
    }

    private fun backtrack(row: Int, n: Int, cols: BooleanArray, diag: BooleanArray, antiDiag: BooleanArray) {
        if (row == n) count++
        for (col in 0 until n) {
            val d: Int = row - col + n
            val aD: Int = row + col
            if (cols[col] || diag[d] || antiDiag[aD]) continue
            cols[col] = true
            diag[d] = true
            antiDiag[aD] = true
            backtrack(row + 1, n, cols, diag, antiDiag)
            cols[col] = false
            diag[d] = false
            antiDiag[aD] = false
        }
    }
}