class Main{

    constructor(lo,maxLen){
      this.lo=lo
      this.maxLen=maxLen
    }
  
    extendPalindrome(s,j,k){
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
  
    longestPalindrome(s){
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