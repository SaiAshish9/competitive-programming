def searchRange(nums,target):
  left = 0
  right = len(nums) - 1
  res = [-1] * 2
  res[0] = -1
  has = False
  while left <= right:
    mid = left + (right-left)//2
    if nums[mid]<target:
      left+=1
    elif nums[mid] == target:
      has = True
      right-=1
    else:
      right-=1
  if has:
    res[0] = left
  left = 0
  right = len(nums) - 1
  while left <= right :
    mid = left + (right-left)//2
    if nums[mid] <= target:
      left +=1
    else:
      right -=1
    if has :
      res[1] = right
    else:
      res[1] = -1
  return res

print(searchRange([5,7,7,8,8,10],8))