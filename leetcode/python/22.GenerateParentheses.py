class Main:

  def generateParenthesis(self,n:int):
    result = []
    self.process("",n,n,result)
    return result
  
  def process(self,prefix,left,right,result):
    if left == 0 and right == 0:
      result.append(prefix)
      return
    if left > 0 :
      self.process(f"{prefix}(",left-1,right,result)
    if left < right:
      self.process(f"{prefix})",left,right-1,result)

sol = Main()
print(sol.generateParenthesis(3))