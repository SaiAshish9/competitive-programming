class Test:

  @staticmethod
  def threeSum(nums):
    result = []
    nums.sort()
    for i in range(len(nums)):
      if i == 0 or nums[i] != nums[i-1]:
        start = i+1
        end = len(nums) - 1
        while start < end :
          s = nums[i] + nums[start] + nums[end]
          if s == 0:
            temp = [nums[i],nums[start],nums[end]]
            result.append(temp)
            startVal = nums[start]
            endVal = nums[end]
            while start < end and startVal == nums[start]:
              start+=1
            while end > start and endVal == nums[end]:
              end-=1
          elif s < 0:
            start+=1
          else:
            end-=1
    return result  
            
print(Test.threeSum([-1, 0, 1, 2, -1, -4]))