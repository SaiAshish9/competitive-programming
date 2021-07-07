def groupAnagrams(strs):
  result = []
  helper = {}
  for s in strs:
    tmpChar = s.split()
    sorted(tmpChar)
    tmp = "".join(tmpChar)
    if helper in list(helper.keys()):
      result[helper[tmp]].append(s)
      continue
    curr = []
    curr.append(s)
    result.append(curr)
    helper[tmp] = len(result) - 1
  return result

dataSet = ["eat","tea","tan","ate","nat","bat"]

print(groupAnagrams(dataSet))