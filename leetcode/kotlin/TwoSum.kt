fun twoSum(a: IntArray, b:Int): List<Int?>? {
    var x = mutableMapOf<Int,Int>();
    for((i,v) in a.withIndex()){
        if(x.containsKey(b -a[i])){
            return listOf(x[b -a[i]],i)
        }
        x[v] = i
    }
    return null
}

fun main(){
    val arr = intArrayOf(3,4,1);
    val ans =twoSum(arr, 5)
    print(ans)
}