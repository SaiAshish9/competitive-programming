class Solution:

  @staticmethod
  def maxArea(num:int)->str:
    base=[1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    chars=["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
    result = ""
    for i in range(len(base)):
      if int(num / base[i]) > 0 :
        for j in range(int(num/base[i])):
          result += chars[i]
        num -= int(num/base[i])*base[i]
    return result

print(Solution.maxArea(12))
