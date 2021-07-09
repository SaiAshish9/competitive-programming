# Job Sequencing Problem

# Problem Statement

```
Given an array of jobs where every job has a
deadline and associated profit if the job is
finished before the deadline.

It is also given that every job takes single
unit of time, so the minimum possible deadline of any job is 1.
How to maximize the total rprofit if only one job can be scheduled
at a time.

```

```
JobId                    A     B    C     D     E
Deadline (Units/time)    2     1    2     1     3
Profit                  100   19   27    25    15

C -> A -> E
```

# Greedy Approach

```
1) Sort all the jobs in decreasing order of profit
2) initialize the result sequences first job in sorted jobs
3) Do following for remaining n-1 jobs:

a. If the current job can fit in the current result sequence
without missing the deadline , add current job to the result,
else ignore the current job.
```

```
1.
A    B    C    D     E
2    1    2    1     3
100  19   27   25    15

A    C    D    B     E
2    2    1    1     3
100  27   25   19    15
```

```
2. 

answer (a to b units / time)   0      1      2      3      4     5
                                  C      A      E


```