def Sum(candidates,target):
  result = []
  if candidates is None or len(candidates) == 0:
    return result
  current = []
  candidates.sort()
  result = combinationSum(candidates,target,0,current,result)
  return result

def combinationSum(candidates,target,j,curr,result):
  if target == 0:
    temp = curr
    result.append(temp)
    print(result)
    return 
  for i in range(j,len(candidates)):
    if target < candidates[i]:
      return
    if i==j or candidates[i] != candidates[i-1]:
      curr.append(candidates[i])
      combinationSum(candidates,target-candidates[i],i,curr,result)
      curr.pop()

Sum([2,3,4,7],7)
  