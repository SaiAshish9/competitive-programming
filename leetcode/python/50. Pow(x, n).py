def myPow(x,n):
  if n==0:
    return 1.0
  half = myPow(x,n//2)
  if n%2==0:
    return half * half
  elif n>0:
    return half * half * x
  else:
    return half * half/x

print(myPow(2.00000,10))