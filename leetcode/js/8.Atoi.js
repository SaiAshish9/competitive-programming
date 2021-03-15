class ATOI{
   static atoi(s){
      let st = s.trim()
      if(st == null || st.length ==0){
        return 0
      }
      let res=0
      let isNegative=false
      let startIndex=0
      
      if(st[0]=='+' || st[0]=='-'){
         startIndex+=1
      }
 
      if(st[0]=='-'){
         isNegative=true
      } 
      
      for(let i=startIndex;i<st.length;i++){
        if(st[i]<'0'||st[i]>'9'){
          break;
        }
        let digit = parseInt(st[i])
        res = res*10+digit
      }
 
      if(isNegative){
        res= -1 * res
      }
 
      if(res > Math.pow(2,31) - 1)
         return Math.pow(2,31)-1
 
      if(res < Math.pow(-2 ^ 31) + 1)
         return Math.pow(-2,31)+1
 
      return res
   }
 }
 
 console.log(ATOI.atoi(" 42"))