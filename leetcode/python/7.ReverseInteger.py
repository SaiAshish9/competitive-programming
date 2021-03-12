class Solution:

  @staticmethod
  def reverse(x):
    if x>0:
      return int(str(x)[::-1])
    else:  
      return -1*int(str(-x)[::-1])

print(Solution.reverse(20))