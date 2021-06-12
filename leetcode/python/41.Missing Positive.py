def findMissingPositive(A):
  n = len(A)
  present = [False for i in range(n)]
  for i in range(n):
    if A[i] > 0 and A[i] <= n:
      present[A[i]] = True
  for i in range(1,n+1):
    if not present[i]:
      return i
  return n+1

nums=[0,-1,3,1]
print(findMissingPositive(nums))