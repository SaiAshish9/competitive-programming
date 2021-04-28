import java.util.*
import java.util.stream.Collectors

internal object Main {
    // Here are the steps we need to follow to solve the problem:
    // 1 From right to left, find the first element that is violating the increase trend, this is called PartitionNumber
    // 2 From right to left, find the first element that is larger than PartitionNumber, this is called ChangeNumber.
    // 3 Switch PartitionNumber and ChangeNumber
    // 4 Reverse all the digit on the right of particionNumber ( Original index)
    fun nextPermutation(nums: IntArray) {
        var paNumIndex = -1
        for (i in nums.size - 1 downTo 1) {
            if (nums[i - 1] < nums[i]) {
                paNumIndex = i - 1
                break
            }
        }
        if (paNumIndex != -1) {
            var chNumIndex = -1
            for (i in nums.size - 1 downTo paNumIndex + 1) {
                if (nums[i] > nums[paNumIndex]) {
                    chNumIndex = i
                    break
                }
            }
            val tmp = nums[paNumIndex]
            nums[paNumIndex] = nums[chNumIndex]
            nums[chNumIndex] = tmp
        }
        var start = paNumIndex + 1
        var end = nums.size - 1
        while (start < end) {
            val tmp = nums[start]
            nums[start] = nums[end]
            nums[end] = tmp
            start++
            end--
        }
        val x = Arrays.stream(nums).boxed().collect(Collectors.toList())
        x.stream().forEach { obj: Int? -> print(obj) }
    }

    @JvmStatic
    fun main(s: Array<String>) {
        nextPermutation(intArrayOf(1, 2, 3))
    }
}