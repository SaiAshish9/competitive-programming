class Solution{
  static reverse(x){
    return x>0?parseInt(String(x).split("").reverse().join("")):
    -1*parseInt(String(-x).split("").reverse().join(""))
  }
}

console.log(Solution.reverse(-12))