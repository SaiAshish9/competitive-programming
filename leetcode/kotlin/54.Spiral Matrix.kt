class Solution {
    fun spiralOrder(matrix: Array<IntArray>?): List<Integer> {
        val result: List<Integer> = ArrayList<Integer>()
        if (matrix == null || matrix.size == 0) return result
        var m = matrix.size
        var n: Int = matrix[0].length
        var x = 0
        var y = 0
        while (m > 0 && n > 0) {
            //if one row/column left, no circle can be formed
            if (m == 1) {
                for (i in 0 until n) {
                    result.add(matrix[x][y++])
                }
                break
            } else if (n == 1) {
                for (i in 0 until m) {
                    result.add(matrix[x++][y])
                }
                break
            }
            //below, process a circle
            //top - move right
            for (i in 0 until n - 1) {
                result.add(matrix[x][y++])
            }
            //right - move down
            for (i in 0 until m - 1) {
                result.add(matrix[x++][y])
            }
            //bottom - move left
            for (i in 0 until n - 1) {
                result.add(matrix[x][y--])
            }
            //left - move up
            for (i in 0 until m - 1) {
                result.add(matrix[x--][y])
            }
            x++
            y++
            m = m - 2
            n = n - 2
        }
        return result
    }
}