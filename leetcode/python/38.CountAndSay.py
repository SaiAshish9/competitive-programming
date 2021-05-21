class Main:

  def countAndSay(self,n):
    result = ""
    for i in range(n):
      if i==0:
        result = "1"
        continue
      result = self.process(result)
    return result
  
  def process(self,s):
    result = ""
    curr = s[0]
    count = 1
    for i in range(1,len(s)):
      if s[i] != curr:
        result += str(count) + str(curr)
        curr = s[i]
        count = 1
        continue
      count +=1
    result += str(count) + "" + str(curr)
    return result

m = Main()
print(m.countAndSay(4))