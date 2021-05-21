class Main{
  
    countAndSay(n){
     let result=""
     for(let i=0;i<n;i++){
       if(i==0){
        result = "1"
        continue
       }
       result = this.process(result)
     }
     return result
    }
  
    process(s){
      let result=""
      let curr = s[0]
      let count = 1
      for(let i=1;i<s.length;i++){
        if(s[i]!=curr){
          result += count + "" + curr
          curr = s[i]
          count = 1
          continue
        }
        count+=1
      }
      result += count + "" + curr
      return result
    }
  
  }
  
  let m = new Main()
  console.log(m.countAndSay(4))