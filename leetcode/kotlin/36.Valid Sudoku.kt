object Main {
    private fun isValidSudoku(board: Array<CharArray>): Boolean {
        val helper: MutableSet<Char> = HashSet()
        for (i in board.indices) {
            helper.clear()
            for (j in board.indices) {
                print(board[i][j].toString() + " ")
                if (!process(helper, board[i][j])) return false
            }
            println("\n")
        }
        for (j in board.indices) {
            helper.clear()
            for (i in board.indices) {
                if (!process(helper, board[i][j])) return false
            }
        }
        var i = 0
        while (i < 9) {
            var j = 0
            while (j < 9) {
                helper.clear()
                for (k in 0..8) {
                    if (!process(helper, board[i + k / 3][j + k % 3])) return false
                }
                j += 3
            }
            i += 3
        }
        return true
    }

    private fun process(helper: MutableSet<Char>, c: Char): Boolean {
        if (c == '.') {
            return true
        }
        if (helper.contains(c)) {
            return false
        }
        helper.add(c)
        return true
    }

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
        println(isValidSudoku(c))
    }
}