object Main {
    private fun searchInsert(nums: IntArray, target: Int): Int {
        return bs(nums, 0, nums.size - 1, target)
    }

    private fun bs(nums: IntArray, start: Int, end: Int, target: Int): Int {
        if (start > end) {
            return end + 1
        }
        val mid = (start + end) / 2
        if (nums[mid] < target) {
            return bs(nums, mid + 1, end, target)
        }
        return if (nums[mid] > target) {
            bs(nums, start, mid - 1, target)
        } else mid
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(
            searchInsert(
                intArrayOf(
                    2, 3, 4, 5, 6
                ), 5
            )
        )
    }
}