import java.util.*

internal class Main {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = LinkedList()
        if (nums.size < 4) {
            return result
        }
        Arrays.sort(nums)
        val max = nums[nums.size - 1]
        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            if (nums[i] + 3 * max < target) {
                continue
            }
            if (nums[i] * 4 > target) {
                break
            }
            for (j in i + 1 until nums.size) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue
                }
                var start = j + 1
                var end = nums.size - 1
                while (start < end) {
                    val sum = nums[i] + nums[j] + nums[start] + nums[end]
                    if (sum == target) {
                        val tmp: MutableList<Int> = LinkedList()
                        tmp.add(nums[i])
                        tmp.add(nums[j])
                        tmp.add(nums[start])
                        tmp.add(nums[end])
                        result.add(tmp)
                        val startVal = nums[start]
                        val endVal = nums[end]
                        while (start < end && startVal == nums[start]) {
                            start++
                        }
                        while (start < end && endVal == nums[end]) {
                            end--
                        }
                    } else if (sum < target) {
                        start++
                    } else {
                        end--
                    }
                }
            }
        }
        return result
    }

    companion object {
        @JvmStatic
        fun main(s: Array<String>) {
            val m = Main()
            println(m.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0).toString())
        }
    }
}