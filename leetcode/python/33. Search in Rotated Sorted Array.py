def search(nums,target):
  start = 0
  end = len(nums) - 1
  while start <= end:
    mid = (start+end)//2
    if nums[mid] == target:
      return mid
    if nums[start] <= nums[mid]:
      if nums[start] <= target and target < nums[mid]:
        end = mid - 1
      else:
        start = mid + 1
    else:
      if nums[mid] < target and target <= nums[end]:
        start = mid + 1
      else:
        end = mid - 1  
  return -1    

print(search([4,5,6,0,1,2],0))
