class ATOI{
    companion object{
        fun atoi(s:String):Int{
            var res:Double=0.0
            var str = s.trim()
            var isNegative:Boolean = false
            var startIndex:Int=0
            if(str[0]=='+'||str[0]=='-'){
                startIndex++
            }
            if(str[0]=='-'){
                isNegative = true
            }
            for(i: Int in startIndex until str.length){
                if(str[i]<'0'||str[i]>'9'){
                    break;
                }
                var digit:Int = (str[i] - '0').toInt()
                res = res *10 + digit
            }
            if(isNegative){
                res = -res
            }
            if(res > Int.MAX_VALUE){
                return Int.MAX_VALUE
            }else if(res<Int.MIN_VALUE){
                return Int.MIN_VALUE
            }
            return res.toInt()
        }
    }
}

fun main(){
  print(ATOI.atoi(" 42"))
}