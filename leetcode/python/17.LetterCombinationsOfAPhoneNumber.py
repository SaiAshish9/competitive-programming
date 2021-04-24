class Main:

  def __initKeyboard(self,keyboard):
    keyboard['2'] = "abc"
    keyboard['3'] = "def"
    keyboard['4'] = "ghi"
    keyboard['5'] = "jkl"
    keyboard['6'] = "mno"
    keyboard['7'] = "pqrs"
    keyboard['8'] = "tuv"
    keyboard['9'] = "wxyz"

  def comp(self,digits:str,prefix:str,start:int,keyboard,result):
    if start == len(digits):
      result.append(prefix)
      return
    cand = keyboard[digits[start]]
    for e in cand:
      self.comp(digits,prefix+e,start+1,keyboard,result)

  def letterCombinations(self,digits:str):
    keyboard = {}
    self.__initKeyboard(keyboard)
    res=[]
    if len(digits)==0:
      return res
    self.comp(digits,"",0,keyboard,res)
    return res
  
m = Main()
print(m.letterCombinations("234"))