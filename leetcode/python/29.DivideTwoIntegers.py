import sys

def  divide(dividend,divisor):
  result=0
  flag=1
  if divisor == 0:
    return sys.maxsize 
  if divisor == -1 or divisor == -sys.maxsize+1:
    return sys.maxsize
  if (dividend <0) ^ (divisor<0):
    flag = -1
  ldd = abs(dividend)
  ldr = abs(divisor)
  while ldd >= ldr:
    shift = 0
    while ldd >= ldr<<shift:
      shift+=1
    shift-=1
    result += 1<<shift
    ldd -= ldr<<shift
    print(f"result : {result} , ldd : {ldd} , shift : {shift}")
  return result * flag

print(divide(10,3))