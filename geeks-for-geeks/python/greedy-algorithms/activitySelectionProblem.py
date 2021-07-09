def printMaxActivities(s,f):
  print("Following activities are selected ")
  i = 0
  print(i)

  for j in range(1,len(f)):
    if s[j] >= f[i]:
      print(j)
      i=j

s = [1,3,0,5,8,5]
f = [9,4,1,7,9,9]
  
f.sort()  
  
printMaxActivities(s,f)