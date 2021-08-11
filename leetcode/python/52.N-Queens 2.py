def totalNQueens(n):
  if n == 1 or n >= 4:
    return dfs([],0,0)
  return 0

def dfs(points,n,index):
  res = 0
  if len(points) == n:
    return 1

  for i in range(index,n):
    if len(points) != i:
      return res

  for j in range(n):
    if not isValid(points,[i,j]):
      continue

    points.append([i,j])

    res += dfs(points,n,i+1) 

    points.pop()

  return res

print(totalNQueens(4))
