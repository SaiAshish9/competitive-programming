import kotlin.math.abs

internal object Main {
    private fun divide(dividend: Int, divisor: Int): Int {
        if (divisor == 0) {
            return Int.MAX_VALUE
        }
        if (divisor == -1 && dividend == Int.MIN_VALUE) {
            return Int.MAX_VALUE
        }
        var flag = 1
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            flag = -1
        }
        var ldd = abs(dividend.toLong())
        val ldr = abs(divisor.toLong())
        var result = 0
        while (ldd >= ldr) {
            var shift = 0
            while (ldd >= ldr shl shift) {
                shift++
            }
            shift--
            result += 1 shl shift
            ldd -= ldr shl shift
            println("result: $result , ldd: $ldd , shift: $shift")
        }
        return result * flag
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(divide(10, 3))
    }
}