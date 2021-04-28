class Main():

  @staticmethod
  def nextPermutation(nums):
    paNumIndex = -1
    for i in range(len(nums),-1):
      if nums[i-1] < nums[i]:
        paNumIndex = i-1
        break
    if paNumIndex != -1:
      chNumIndex = -1
      for i in range(len(nums),paNumIndex+1):
        if nums[i] > nums[paNumIndex]:
          chNumIndex = i
          break
      tmp = nums[paNumIndex]
      nums[paNumIndex] = nums[chNumIndex]
      nums[chNumIndex] = tmp
    start = paNumIndex + 1
    end = len(nums) - 1
    while start < end:
      nums[start],nums[end] = nums[end],nums[start]
      start+=1
      end-=1
    return nums

print(Main.nextPermutation([1,2,3]))