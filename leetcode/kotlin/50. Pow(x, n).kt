internal class Main {
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        val half = myPow(x, n / 2)
        return if (n % 2 == 0) half * half else if (n > 0) half * half * x else half * half / x
    } // a^m + a^n = a^(m+n)
    // a^-m + a^-n = a^-(m+n)
}