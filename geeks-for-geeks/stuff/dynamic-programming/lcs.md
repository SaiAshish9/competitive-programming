# Longest Common Subsequence

```
Given two sequences , find the length of longest subsequence 
present in both of them

A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous.

Sequences = "abcdefg", "abxdfg"
```

```
If the last characters do not match . Increment the length of LCS by 1 and process L1[m-1] and L2[n-1]

LCS[i][j] = LCS[i-1][j-1] + 1

If the last characters do not match. Find max L1[m-1]L2[n] , L1[m]L2[n-1]

LCS[i][j] = max(LCS[i-1][j],LCS[i][j-1])
```