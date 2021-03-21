class Solution:

  @staticmethod
  def lcp(s):
    if len(s)==0:
      return ""
    prefix = s[0]
    for i in range(len(s)):
      for j in range(len(prefix)):
        if j == len(s[i]) or prefix[j] != s[i][j]:
          prefix = prefix[:j]
          break
    return prefix


print(Solution.lcp(["flower", "flow", "flight"]))
