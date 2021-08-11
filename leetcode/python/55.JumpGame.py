class Solution:

  @staticmethod
  def canJump(nums):
    maximum =0
    for i in range(len(nums)):
      if i > maximum:
        return False
      maximum = max(maximum,i+nums[i])
    return True

print(Solution.canJump([5,7,8,1,2,3]))