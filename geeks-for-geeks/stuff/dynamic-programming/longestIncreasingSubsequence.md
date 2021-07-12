# Longest Increasing Subsequence 

```
Find the length of the longest subsequence of a given sequence
such that all elements of the subsequence are sorted in increasing
order
```

e.g.

```
LIS = {10,22,9,33,21,50,41,60}

Subsequences : {10},{10,22},{10,9,33},{33,21,60},{50,60},etc

Longest Increasing Subsequence

10,22,33,50,60 or 10,22,33,41,60

LIS = 5
```


```
For i=0:

iterator j i   
arr[]    10   22  9  33  21 + 50  41  60
LIS      1    1   1   1   1   1   1   1

For i=1:

iterator j    i
arr[]    10   22  9  33  21  50  41  60
LIS      1    2   1   1   1   1   1   1

For i=2:

iterator j        i
arr[]    10   22  9  33  21  50  41  60
LIS      1    2   1   1   1   1   1   1

10 < 9

it means that current sequence cannot be extended

For i=3:

iterator      j       i
arr[]    10   22  9  33  21  50  41  60
LIS      1    2   1   2   1   1   1   1


Final values:

iterator                          j   i
arr[]    10   22  9  33  21  50  41  60
LIS      1    2   1   3   2   4   4   5
```