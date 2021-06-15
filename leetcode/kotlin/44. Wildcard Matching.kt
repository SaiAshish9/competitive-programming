fun isMatch(s: String, p: String): Boolean {
    val dp = Array(s.length() + 1) {
        BooleanArray(
            p.length() + 1
        )
    }
    dp[0][0] = true
    for (j in 1..p.length()) {
        if (p.charAt(j - 1) === '*') {
            dp[0][j] = dp[0][j - 1]
        }
    }
    for (i in 1 until s.length() + 1) {
        for (j in 1 until p.length() + 1) {
            if (p.charAt(j - 1) === '?' || p.charAt(j - 1) === s.charAt(i - 1)) {
                dp[i][j] = dp[i][j] || dp[i - 1][j - 1]
            } else if (p.charAt(j - 1) === '*') {
                dp[i][j] = dp[i - 1][j] || dp[i][j - 1]
            }
        }
    }
    return dp[s.length()][p.length()]
}