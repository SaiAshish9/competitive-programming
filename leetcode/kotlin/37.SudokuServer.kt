import java.util.*

class Main {
    fun solveSudoku(board: Array<CharArray>) {
        solve(board, 0, 0)
    }

    private fun solve(board: Array<CharArray>, i: Int, j: Int): Boolean {
        var i = i
        var j = j
        if (i == board.size - 1 && j == board[0].length) {
            return true
        }
        if (j == board[0].length) {
            i = i + 1
            j = 0
        }
        if (board[i][j] == '.') {
            for (k in 1..9) {
                board[i][j] = ('0'.toInt() + k).toChar()
                if (valid(board, i, j) == true) {
                    val tmp = solve(board, i, j + 1)
                    if (tmp == true) {
                        return true
                    }
                }
            }
            board[i][j] = '.'
        } else {
            return solve(board, i, j + 1)
        }
        return false
    }

    private fun valid(board: Array<CharArray>, x: Int, y: Int): Boolean {
        var check = 0
        for (j in 0 until board[0].length) {
            val `val` = board[x][j] - '0'
            if (board[x][j] == '.') {
                continue
            }
            check = if (check and (1 shl `val` - 1) == 1 shl `val` - 1) {
                return false
            } else {
                check or 1 shl `val` - 1
            }
        }
        check = 0
        for (i in board.indices) {
            val `val` = board[i][y] - '0'
            if (board[i][y] == '.') {
                continue
            }
            check = if (check and (1 shl `val` - 1) == 1 shl `val` - 1) {
                return false
            } else {
                check or 1 shl `val` - 1
            }
        }
        val ib = x / 3
        val jb = y / 3
        check = 0
        for (i in ib * 3 until (ib + 1) * 3) {
            for (j in jb * 3 until (jb + 1) * 3) {
                val `val` = board[i][j] - '0'
                if (board[i][j] == '.') {
                    continue
                }
                check = if (check and (1 shl `val` - 1) == 1 shl `val` - 1) {
                    return false
                } else {
                    check or 1 shl `val` - 1
                }
            }
        }
        return true
    }

    fun display(c: Array<CharArray>, s: String?) {
        ps.println(s)
        for (x in c) {
            ps.println(Arrays.toString(x))
        }
    }

    companion object {
        var ps = System.out
        @JvmStatic
        fun main(s: Array<String>) {
            val c = arrayOf(
                charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
            )
            val m = Main()
            m.display(c, "Before processing...")
            m.solveSudoku(c)
            m.display(c, "After processing...")
        }
    }
}