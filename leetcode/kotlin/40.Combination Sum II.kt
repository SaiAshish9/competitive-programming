import java.util.*

internal class Solution {
    fun combinationSum2(candidates: IntArray?, target: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        if (candidates == null || candidates.isEmpty()) return result
        val current = ArrayList<Int>()
        Arrays.sort(candidates)
        combinationSum(candidates, target, 0, current, result)
        return result
    }

    private fun combinationSum(
        candidates: IntArray,
        target: Int,
        j: Int,
        curr: ArrayList<Int>,
        result: MutableList<List<Int>>
    ) {
        if (target == 0) {
            val temp = ArrayList(curr)
            result.add(temp)
            return
        }
        for (i in j until candidates.size) {
            if (target < candidates[i]) {
                return
            }
            if (i == j || candidates[i] != candidates[i - 1]) {
                curr.add(candidates[i])
                combinationSum(candidates, target - candidates[i], i + 1, curr, result)
                curr.removeAt(curr.size - 1)
            }
        }
    }
}