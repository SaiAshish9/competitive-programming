class Solution {
    fun canJump(nums: IntArray): Boolean {
        var max = 0
        for (i in nums.indices) {
            if (i > max) {
                return false
            }
            max = Math.max(max, i + nums[i])
        }
        return true
    }
}