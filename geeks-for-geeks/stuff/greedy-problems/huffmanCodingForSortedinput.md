```
1. Create two empty queues.
2. Create a leaf node for each unique character and Enqueue it to the first queue in non-decreasing order of frequency. Initially second queue is empty.
3. Dequeue two nodes with the minimum frequency by examining the front of both queues. Repeat following steps two times 
        1. If second queue is empty, dequeue from first queue. 
        2. If first queue is empty, dequeue from second queue. 
        3. Else, compare the front of two queues and dequeue the minimum. 
4. Create a new internal node with frequency equal to the sum of the two nodes frequencies. Make the first Dequeued node as its left child and the second Dequeued node as right child. Enqueue this node to second queue.
5. Repeat steps#3 and #4 while there is more than one node in the queues. The remaining node is the root node and the tree is complete
```

```
Character  a  b   c   d   e  f
Frequency  5  9   12  13  16 45


Q1  a/5  b/9  c/12  d/13  e/16  f/45

Q2 
```


```
Q1 c/12  d/13  e/16  f/45

Q2 N1/14
```

```
Q1 e/16  f/45

Q2 N1/14 N2/25
```

N1 < e

dequeue it

```
Q1  f/45

Q2 N2/25 N3/30
```

45 > 30

```
Q1  f/45
Q2  N2/25 N3/30
```

```
Q1 f/45
Q2 N4/55
```

```
Q1 
Q2 N5/100 (f/45 + N4/55)
```


