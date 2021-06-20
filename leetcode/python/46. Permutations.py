def permute(nums):
  res = []
  visited = [False] * len(nums)
  dfs(nums,res,[],visited)
  return res 

def dfs(nums,res=[],curr=[],visited=[]):
  if len(curr) == len(nums):
    res.append(curr[:])
    return
  
  for i in range(len(nums)):
    if visited[i] == False:
      visited[i] = True
      curr.append(nums[i])
      dfs(nums,res,curr,visited)
      curr.pop()
      visited[i] = False

print(permute([1,2,3]))