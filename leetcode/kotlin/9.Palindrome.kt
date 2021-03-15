class Solution{
    companion object{
        fun isPalindrome(x:Int):Boolean{
            var n:Int=x
            if(x<0)
                return false
            var rev:Int=0
            while(n>0){
                rev=rev*10+(n%10)
                n/=10
            }
            return x==rev
        }
    }
}

fun main(){
    print(Solution.isPalindrome(121))
}