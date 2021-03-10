class Main(){
    var lo:Int = 0;
    var maxLen:Int = 0;
    private fun extendPalindrome(s:String,j1:Int,k1:Int){
        var j=j1
        var k = k1
        while (j>=0 && k < s.length && s[j] == s[k]){
            j--
            k++
        }
        if(maxLen<k-j+1)
        {
            lo = j+1
            maxLen = k-j+1
        }
    }
    fun longestPalindrome(s:String): String {
        var len = s.length;
        if(len <2)
        return s;
        for (i in 0..len){
            extendPalindrome(s,i,i)
            extendPalindrome(s,i,i+1)
        }
        return s.substring(lo,lo+maxLen)
    }
}