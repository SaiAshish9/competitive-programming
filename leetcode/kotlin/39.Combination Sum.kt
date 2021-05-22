import java.util.*

internal object Main {
    private var ps = System.out
    private fun combinationSum(candidates: IntArray?, target: Int): List<List<Int>> {
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
        // if target is zero add curr to result & clear it
        for (i in j until candidates.size) {
            if (target < candidates[i]) return
            curr.add(candidates[i])
            combinationSum(candidates, target - candidates[i], i, curr, result)
            curr.removeAt(curr.size - 1)
        }
    }

    @JvmStatic
    fun main(st: Array<String>) {
        combinationSum(intArrayOf(2, 3, 6, 7), 7).stream().forEach { x: List<Int>? ->
            ps.println(
                x
            )
        }
    }
}