class Main:
  def romanToInt(self,s):
    helper = {
      'M':1000,
      'D':500,
      'C':100,
      'L':50,
      'X':10,
      'V':5,
      'I':1
    }
    result = 0
    for i in range(0,len(s)):
      if i > 0 and helper[s[i]] > helper[s[i-1]]:
        result -= 2 * helper[s[i-1]]
      result += helper[s[i]]
    return result 
    
m = Main()
print(m.romanToInt("IV"))