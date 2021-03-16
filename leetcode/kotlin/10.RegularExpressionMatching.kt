class Solution{
    companion object {
        fun isMatch(s:String,p:String):Boolean{
            val rows:Int=0
            val columns:Int=0
            val dp = Array(
                rows+1
            ){
                BooleanArray(columns+1)
            }
            dp[0][0]=true
            for(i in 2 until  columns+1){
                if(p[i-1]=='*'){
                    dp[0][i]=dp[0][i-2]
                }
            }
            for(i in 1 until  rows+1){
                for(j in 1 until columns+1){
                    if (s[i - 1] === p[j - 1] || p[j - 1] === '.') {
                        dp[i][j] = dp[i - 1][j - 1]
                    } else if (j > 1 && p[j - 1] === '*') {
                        dp[i][j] = dp[i][j - 2]
                        if (p[j - 2] === '.' || p[j - 2] === s[i - 1]) {
                            dp[i][j] = dp[i][j] or dp[i - 1][j]
                        }
                    }
                }
            }

            return dp[rows][columns]
        }
    }
}

fun main(){
  print(Solution.isMatch("aab","c*a*b"))
}