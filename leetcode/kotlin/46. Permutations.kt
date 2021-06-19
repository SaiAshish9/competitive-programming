import java.io.*
import java.util.*
import java.util.stream.Collectors

internal object Main {
    var ps: PrintStream = System.out
    fun permute(nums: IntArray): List<List<Integer>> {
        val res: List<List<Integer>> = LinkedList()
        val visited = BooleanArray(nums.size)
        dfs(nums, res, LinkedList<Integer>(), visited)
        return res
    }

    private fun dfs(nums: IntArray, res: List<List<Integer>>, curr: List<Integer>, visited: BooleanArray) {
        if (curr.size() === nums.size) {
            res.add(LinkedList<Integer>(curr))
            return
        }
        for (i in nums.indices) {
            if (visited[i] == false) {
                visited[i] = true
                curr.add(nums[i])
                dfs(nums, res, curr, visited)
                curr.remove(curr.size() - 1)
                visited[i] = false
            }
        }
    }

    fun main(vararg s: String?) {
        val res: List<List<Integer>> = permute(intArrayOf(1, 2, 3))
        for (l in res) {
            ps.println(l.stream().map { n -> String.valueOf(n) }.collect(Collectors.joining(",", "[", "]")))
        }
    }
}