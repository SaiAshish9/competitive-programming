class Solution:
  @staticmethod
  def isPalindrome(x):
    n=x
    if x<0:
      return False
    rev=0
    while int(n)>0:
      rev = rev*10 + int(n)%10
      n/=10
    if x==rev:
      return True
    else:
      return False
  
print(Solution.isPalindrome(121))