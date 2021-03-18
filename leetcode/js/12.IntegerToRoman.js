class Solution{
    static intToRoman(n){
      let  num=n
      const base=[1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
      const chars=["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
      let result=""
      for(let i=0;i<base.length;i++){
        if(parseInt(num/base[i])>0){
         for(let j=0;j<parseInt(num/base[i]);j++){
           result+=chars[i]
         }
         num-= parseInt((num/base[i]))*base[i]
        }
      }
      return result
    }
 }
 
 console.log(Solution.intToRoman(12))