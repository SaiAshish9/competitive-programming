import java.util.*
import kotlin.math.abs

object Main {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }
        Arrays.sort(nums)
        var min = Int.MAX_VALUE
        var closed = 0
        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                var start = i + 1
                var end = nums.size - 1
                while (start < end) {
                    val sum = nums[i] + nums[start] + nums[end]
                    if (abs(sum - target) < min) {
                        min = abs(sum - target)
                        closed = sum
                    }
                    if (sum < target) {
                        start++
                    } else {
                        end--
                    }
                }
            }
        }
        return closed
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(threeSumClosest(intArrayOf(-1, 3, 3), 5))
    }
}