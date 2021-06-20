def permute(nums):
  res = []
  visited = [False] * len(nums)
  if nums is None or len(nums) == 0:
    return res
  nums.sort()
  dfs(nums,res,[],visited)
  return res 

def dfs(nums,res=[],curr=[],visited=[]):
  if len(curr) == len(nums):
    res.append(curr[:])
    return
  
  for i in range(len(nums)):
    if visited[i] == True:
      continue
    if i==0 or nums[i] != nums[i-1] or (nums[i]== nums[i-1] and visited[i-1] == True):
      visited[i] = True
      curr.append(nums[i])
      dfs(nums,res,curr,visited)
      curr.pop()
      visited[i] = False

print(permute([1,1,2]))