import java.util.*
import java.util.stream.Collectors

internal object Main {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var nums = nums
        var arr = Arrays.stream(nums).boxed().collect(Collectors.toList())
        arr = arr.stream().filter { x: Int -> x != `val` }
            .collect(Collectors.toList())
        // Integer[] x = arr.toArray();
        nums = arr.stream().mapToInt { i: Int? -> i!! }.toArray()
        println(nums[0].toString() + " " + nums[1])
        return arr.size
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(removeElement(intArrayOf(3, 2, 2, 3), 3))
    }
}