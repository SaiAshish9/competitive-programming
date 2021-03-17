class Solution:

  @staticmethod
  def maxArea(height)->int:
    max1=0
    min1=0
    left=0
    right=len(height)-1
    while left<right:
      max1 = max(max1, min(height[left], height[right]) * (right - left))
      if height[left]<height[right]:
        left+=1
      else:
        right-=1
    return max1

print(Solution.maxArea([1,2,1]))
