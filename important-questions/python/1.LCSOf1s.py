x = [1,1,1,0,1,1,0,1,1]

y=[0]

for i in range(1,len(x)):
  if x[i] == 0:
    y.append(i)

y.append(len(x)-1)

max=0
diff=0
current=0

for i in range(0,len(y)-2):
  diff = y[i+2] - y[i]
  if diff > max:
    max= diff
    current = y[i+1]

if len(y)==2 and x[-1]==0:
  current = len(x) -1

print(current)