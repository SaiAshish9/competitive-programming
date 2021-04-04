class Main:

  @staticmethod
  def fourSum(nums,target:int):
    result = []
    if len(nums)<4:
      return result
    nums.sort()
    maximum = nums[-1]
    for i in range(len(nums)):
      if i > 0 and nums[i]==nums[i-1]:
        continue
      if nums[i] + 3 * maximum < target:
        continue
      if nums[i]*4 > target:
        break
      for j in range(i+1,len(nums)):
        if j > i+1 and nums[j]==nums[j-1]:
          continue
        start = j+1
        end= len(nums)-1
        while start < end :
          total = nums[i]+nums[j]+nums[start]+nums[end]
          if total == target :
            tmp = []
            tmp.append(nums[i])
            tmp.append(nums[j])
            tmp.append(nums[start])
            tmp.append(nums[end])
            result.append(tmp)
            startVal = nums[start]
            endVal = nums[end]
            while start < end and startVal == nums[start]:
              start += 1
            while start < end and endVal == nums[end]:
              end -= 1
          elif total < target:
            start+=1
          else :
            end -=1
    return result

print(Main.fourSum([1,0,-1,0,-2,2],0))
              

            
