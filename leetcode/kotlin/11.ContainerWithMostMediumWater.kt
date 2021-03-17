import kotlin.math.min

class Solution{
    companion object{
        fun maxArea(height: List<Int>):Int{
          var max:Int=0
          var left:Int=0
          var right=height.size-1
          while(left<right){
              max = kotlin.math.max(max, min(height[left], height[right]) * (right - left));
              if (height[left] < height[right]) {
                  left ++;
              }
              else {
                  right --;
              }
          }
          return max
        }
    }
}

fun main(){
    val arr= listOf<Int>(1,2,1)
    print(Solution.maxArea(arr))
}