internal class Solution {
    var ans: List<List<String>>? = null
    var board: Array<CharArray>
    fun solveNQueens(N: Int): List<List<String>>? {
        ans = ArrayList()
        board = Array(N) { CharArray(N) }
        for (row in board) Arrays.fill(row, '.')
        place(0, 0, 0, 0)
        return ans
    }

    private fun place(i: Int, vert: Int, ldiag: Int, rdiag: Int) {
        val N = board.size
        if (i == N) {
            val res: List<String> = ArrayList()
            for (row in board) res.add(String(row))
            ans.add(res)
            return
        }
        for (j in 0 until N) {
            val vmask = 1 shl j
            val lmask = 1 shl i + j
            val rmask = 1 shl N - i - 1 + j
            if ((vert and vmask) + (ldiag and lmask) + (rdiag and rmask) > 0) continue
            board[i][j] = 'Q'
            place(i + 1, vert or vmask, ldiag or lmask, rdiag or rmask)
            board[i][j] = '.'
        }
    }
}