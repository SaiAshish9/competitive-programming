internal object LIS {
    var max_ref = 0
    fun _lis(arr: IntArray, n: Int): Int {
        if (n == 1) return 1
        var res: Int
        var max_ending_here = 1
        for (i in 1 until n) {
            res = _lis(arr, i)
            if (arr[i - 1] < arr[n - 1]
                && res + 1 > max_ending_here
            ) max_ending_here = res + 1
        }
        if (max_ref < max_ending_here) max_ref = max_ending_here
        return max_ending_here
    }

    fun lis(arr: IntArray, n: Int): Int {
        max_ref = 1
        _lis(arr, n)
        return max_ref
    }

    fun main(args: Array<String?>?) {
        val arr = intArrayOf(10, 22, 9, 33, 21, 50, 41, 60)
        val n = arr.size
        System.out.println(
            """
                Length of lis is ${lis(arr, n)}
                
                """.trimIndent()
        )
    }
}