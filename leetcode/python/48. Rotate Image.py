def rotate(arr):
  n = len(arr)
  for i in range(n//2):
    for j in range(-(-n//2)):
      temp = arr[i][j]
      arr[i][j] = arr[n-1-j][i]
      arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j]
      arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i]
      arr[j][n - 1 - i] = temp

arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],  
]

print(arr)
rotate(arr)
print("#############")
print(arr)