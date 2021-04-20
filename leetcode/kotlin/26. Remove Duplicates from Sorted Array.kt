import java.util.*

internal class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val map = TreeMap<Int, Int>()
        for (i in nums.indices) {
            if (!map.containsValue(nums[i])) {
                map[i] = nums[i]
            }
        }
        var i = 0
        for ((_, value) in map) {
            nums[i] = value
            i++
        }
        return map.size
    }
}