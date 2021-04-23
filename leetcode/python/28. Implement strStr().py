def strStr(haystack,needle):
  if len(needle)==0:
    return 0
  kmp = [0] * len(needle)
  computeKMP(needle,kmp)
  i=0
  j=0
  while i < len(haystack):
    if j==-1 :
      j=0
      i+=1
      continue
    if haystack[i] == needle[j]:
      if j == len(needle) - 1:
        return i - len(needle) + 1
      i+=1
      j+=1
    else:
      j = kmp[j]
  return -1

def computeKMP(s,kmp):
  prefixEnd = -1
  suffixEnd = 0
  kmp[0] = -1
  while  suffixEnd < len(s) - 1:
    if prefixEnd == -1 or s[prefixEnd] == s[suffixEnd]:
      kmp[suffixEnd+1] = prefixEnd + 1
      prefixEnd +=1
      suffixEnd +=1
    else:
      prefixEnd = kmp[prefixEnd]

print(strStr("hello","ll"))