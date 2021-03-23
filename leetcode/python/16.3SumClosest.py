import sys

class Test:

  @staticmethod
  def threeSumClosest(nums,target):
    if len(nums) == 0:
      return 0    
    nums.sort()
    # python 2 -> sys.maxint
    # python 3 > sys.maxsize
    minimum =  sys.maxsize
    closed = 0

    for i in range(len(nums)):
      if i == 0 or nums[i] != nums[i-1]:
        start = i+1
        end = len(nums) - 1
        while start < end :
          s = nums[i] + nums[start] + nums[end]
          if abs(s-target)<minimum:
            minimum = abs(s-target)
            closed = s
          if s < target:
            start+=1
          else:
            end-=1
    return closed
            
print(Test.threeSumClosest([-1, 0, 1, 2, -1, -4],8))