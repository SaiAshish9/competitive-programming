```
{1,2,5,10,20,50,100,500,1000}

Input Value: 70
Output: 2

(50 + 20)

Input value: 121
Output: 3

(100 + 20 + 1)
```

```
Greedy Approach:

1. Initialize result as empty
2. Find the largest denomination that is smaller than V
3. Add found denomination to result. Subtract value of found denominatiom from V
4. If V becomes 0, then print result
Else repeat steps 2 and 3 for new value of V
```

```
70

2. 50 70-50=20

3. 20 20-20=0
```
