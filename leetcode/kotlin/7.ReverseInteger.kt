class A{
    companion object{
        fun reverse(x:Int):Int{
            var n:Long = x.toLong();
            var ans:Long=0;
            var sign:Int=1;
            if(x<0){
                n*=-1;
                sign*=-1;
            }
            while(n>0){
                ans= ans*10 + n%10;
                n/=10;
            }
            if(ans > Integer.MAX_VALUE){
                return 0;
            }
            return (sign*ans).toInt();
        }
    }
}


fun main(){
    println(A.reverse(123))
}