import java.util.stream.Collectors
import java.util.*
import java.io.*

internal object Main {
    var ps: PrintStream = System.out
    fun trap(height: IntArray): Int {

        //   store the maximum height upto the current index in a separate array . Start storing the maximum index in reverse order and compute the difference at a given index between 2 arrays as per the algorithm.
        if (height.size == 0) {
            return 0
        }
        val left = IntArray(height.size)
        val right = IntArray(height.size)
        var max = height[0]
        left[0] = height[0]
        for (i in 1 until height.size) {
            if (height[i] > max) {
                max = height[i]
            }
            left[i] = max
        }
        max = height[height.size - 1]
        right[height.size - 1] = height[height.size - 1]
        for (i in height.size - 2 downTo 0) {
            if (height[i] > max) {
                max = height[i]
            }
            right[i] = max
        }
        var water = 0
        for (i in height.indices) {
            water += Math.min(left[i], right[i]) - height[i]
        }
        return water
    }

    fun main(vararg s: String?) {
        ps.println(trap(intArrayOf(4, 2, 0, 3, 2, 5)))
    }
}