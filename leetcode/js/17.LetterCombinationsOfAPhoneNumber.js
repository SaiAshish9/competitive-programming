class Main{

    initKeyboard(keyboard){
     keyboard['2'] = "abc"
     keyboard['3'] = "def"
     keyboard['4'] = "ghi"
     keyboard['5'] = "jkl"
     keyboard['6'] = "mno"
     keyboard['7'] = "pqrs"
     keyboard['8'] = "tuv"
     keyboard['9'] = "wxyz"
    }
    
    compile(digits,prefix,start,keyboard,res){
       if(start==digits.length){
           res.push(prefix)
           return
       }
       let cand = keyboard[digits[start]]
       for(const e in cand){
         this.compile(digits,prefix+e,start+1,keyboard,res)
       }
    }
 
 // # -> private
 
    letterCombinations(digits){
       let keyboard={}
       this.initKeyboard(keyboard)
       let res = []
       if(digits.length==0){
           return res
       }
       this.compile(digits,"",0,keyboard,res)
       return res
    }
 
 }
 
 const m = new Main()
 console.log(m.letterCombinations("234"))