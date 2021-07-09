import java.util.Arrays
import java.util.Comparator

object Main {
    private fun getMaxValue(
        wt: IntArray, `val`: IntArray,
        capacity: Int
    ): Double {
        var capacity = capacity
        val iVal: Array<ItemValue> = arrayOfNulls(wt.size)
        for (i in wt.indices) {
            iVal[i] = ItemValue(wt[i], `val`[i], i)
        }
        Arrays.sort(iVal, object : Comparator<ItemValue?>() {
            @Override
            fun compare(o1: ItemValue, o2: ItemValue): Int {
                return o2.cost.compareTo(o1.cost)
            }
        })
        var totalValue = 0.0
        for (i: ItemValue in iVal) {
            val curWt = i.wt.toInt()
            val curVal = i.`val`.toInt()
            if (capacity - curWt >= 0) {
                capacity = capacity - curWt
                totalValue += curVal.toDouble()
            } else {
                val fraction = capacity.toDouble() / curWt.toDouble()
                totalValue += curVal * fraction
                capacity = (capacity - curWt * fraction).toInt()
                break
            }
        }
        return totalValue
    }

    fun main(args: Array<String?>?) {
        val wt = intArrayOf(10, 40, 20, 30)
        val `val` = intArrayOf(60, 40, 100, 120)
        val capacity = 50
        val maxValue = getMaxValue(wt, `val`, capacity)
        System.out.println(
            "Maximum value we can obtain = "
                    + maxValue
        )
    }

    internal class ItemValue(wt: Int, `val`: Int, ind: Int) {
        var cost: Double
        var wt: Double
        var `val`: Double
        var ind: Double

        init {
            this.wt = wt.toDouble()
            this.`val` = `val`.toDouble()
            this.ind = ind.toDouble()
            cost = Double(`val`.toDouble() / wt.toDouble())
        }
    }
}