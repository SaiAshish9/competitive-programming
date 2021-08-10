class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currSum = 0
        var max: Int = Integer.MIN_VALUE
        for (i in nums.indices) {
            currSum = Math.max(currSum + nums[i], nums[i])
            max = Math.max(currSum, max)
        }
        return max
    }
}