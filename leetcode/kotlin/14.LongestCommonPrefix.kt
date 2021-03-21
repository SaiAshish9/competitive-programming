package com.programming

internal class Test{
    companion object{
        fun lcp(s: List<String>):String {
            if(s.isEmpty()){
                return ""
            }
            var prefix:String = s[0]
            for(i in s.indices){
                for(j in prefix.indices){
                    if(j == s[i].length || prefix[j]!= s[i][j]){
                        prefix = prefix.substring(0,j)
                        break
                    }
                }
            }
            return prefix
        }
    }
}

fun main(){
    print(Test.lcp(listOf<String>("flower", "flow", "flight")))
}