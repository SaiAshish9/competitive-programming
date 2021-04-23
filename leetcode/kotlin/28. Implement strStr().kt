object Main {
    private fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        val kmp = IntArray(needle.length)
        computeKMP(needle, kmp)
        var i = 0
        var j = 0
        while (i < haystack.length) {
            if (j == -1) {
                j = 0
                i++
                continue
            }
            if (haystack[i] == needle[j]) {
                if (j == needle.length - 1) {
                    return i - needle.length + 1
                }
                i++
                j++
            } else {
                j = kmp[j]
            }
        }
        return -1
    }

    private fun computeKMP(s: String, kmp: IntArray) {
        var prefixEnd = -1
        var suffixEnd = 0
        kmp[0] = -1
        while (suffixEnd < s.length - 1) {
            if (prefixEnd == -1 || s[prefixEnd] == s[suffixEnd]) {
                kmp[suffixEnd + 1] = prefixEnd + 1
                prefixEnd++
                suffixEnd++
            } else {
                prefixEnd = kmp[prefixEnd]
            }
        }
    }

    @JvmStatic
    fun main(s: Array<String>) {
        println(strStr("hello", "ll"))
    }
}