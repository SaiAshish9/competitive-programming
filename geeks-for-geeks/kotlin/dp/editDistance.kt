internal object EDIST {
    fun min(x: Int, y: Int, z: Int): Int {
        if (x <= y && x <= z) return x
        return if (y <= x && y <= z) y else z
    }

    fun editDist(
        str1: String, str2: String?, m: Int,
        n: Int
    ): Int {
        if (m == 0) return n
        if (n == 0) return m
        return if (str1.charAt(m - 1) === str2.charAt(n - 1)) editDist(str1, str2, m - 1, n - 1) else 1
        +min(
            editDist(str1, str2, m, n - 1),  // Insert
            editDist(str1, str2, m - 1, n),  // Remove
            editDist(
                str1, str2, m - 1,
                n - 1
            ) // Replace
        )
    }

    fun main(args: Array<String?>?) {
        val str1 = "sunday"
        val str2 = "saturday"
        System.out.println(
            editDist(
                str1, str2, str1.length(), str2.length()
            )
        )
    }
}