def convert(str):
  current=0
  max=0
  i=0
  start=0
  st=0
  obj={}
  for i in range(0,len(str)):
    if not str[i] in obj:
      obj[str[i]]=i
    else :
      if obj[str[i]] >= st:
        current = i - st
        if max < current:
          max= current
          start = st
        st = obj[str[i]]+1
      obj[str[i]]=i
    if max < i -st:
      max = i - st
      start = st
      
  return str[start:start+max]
   
str = "abcdgdkjhjacaiachius"
print(convert(str))