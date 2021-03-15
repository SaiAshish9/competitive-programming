class Solution{
    static isPalindrome(x){
      var n=x
      if(n<0){
        return false
      }
      var rev=0
      while(parseInt(n)>0){
        rev=rev*10+parseInt(n)%10
        n/=10
      }
      if(rev==x){
        return true
      }else{
        return false
      }
    } 
 }
 
 console.log(Solution.isPalindrome(121))