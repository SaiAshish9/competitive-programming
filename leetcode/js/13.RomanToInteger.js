class Main{
    romanToInt(s){
      let helper = {
        'M':1000,
        'D':500,
        'C':100,
        'L':50,
        'X':10,
        'V':5,
        'I':1
      }
      var result =0
      for(let i=0;i<s.length;i++){
         if(i>0 && helper[s[i]] > helper[s[i-1]]){
            result -= 2 * helper[s[i-1]]
         }
         result += helper[s[i]]
      }
      return result
    }
  }
  
  var m = new Main()
  console.log(m.romanToInt("IV"))