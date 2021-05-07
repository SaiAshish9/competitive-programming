internal object Main {
    private fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1
        val res = IntArray(2)
        res[0] = -1
        var has = false
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] < target) {
                left++
            } else if (nums[mid] == target) {
                has = true
                right--
            } else {
                right--
            }
        }
        if (has) {
            res[0] = left
        }
        left = 0
        right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] <= target) {
                left++
            } else {
                right--
            }
        }
        if (has) {
            res[1] = right
        }
        return res
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).contentToString())
    }
}