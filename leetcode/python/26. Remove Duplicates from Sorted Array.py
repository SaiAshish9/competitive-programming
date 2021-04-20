def removeDuplicates(nums):
  m = {}
  for i in range(len(nums)):
    if not nums[i] in m.values():
      m[i]=nums[i]
  for i in range(len(m.values())):
    nums[i] = list(m.values())[i]
  return len(m)

print(removeDuplicates([0,0,1,2,2,3,4]))