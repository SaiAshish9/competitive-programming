arr1 = [1,4]
arr2 = [2,5]
arr3 =[]
arr3 += arr1
arr3 += arr2
arr3.sort()

median = None
mid = None

mid = int(len(arr3)/2)

if len(arr3) % 2 !=0 :
  median = arr3[mid]
else :
  median = (arr3[mid-1] + arr3[mid])/2

print(median)