class Solution{
  
    static isValid(s){
      var match={
        ')':'(',
        '}':'{',
        ']':'['
      }
      var stack=[]
      for(let i in s){
        if(s[i]==='('||s[i]==='{'||s[i]==='['){
          stack.push(s[i])
          continue
        }
        if(stack.length === 0 || match[s[i]] != stack.pop()){
          return false
        }
      }
        return stack.length === 0
    }
  }
  
  console.log(Solution.isValid('()()'))