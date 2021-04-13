class Main{
    generateParenthesis(n){
      var result = []
      this.process("",n,n,result)
      return result
    }
  
    process(prefix,left,right,result){
      if(left===0 && right===0){
        result.push(prefix)
        return
      }
      if(left>0){
        this.process(`${prefix}(`,left-1,right,result)
      }
      if(left<right){
        this.process(`${prefix})`,left,right-1,result)
      }
    }
  }
  
  let sol = new Main()
  console.log(sol.generateParenthesis(3))