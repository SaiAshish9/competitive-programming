# Minimum Spanning Tree


```
It is a subset of the edges of a connected , edgeweighted graph that connects all the vertices together, without any cycles and with the minimum possible totol edge weight. 

|E| = |V| -1
```

# Applications

```
Network Design:

Telephone
Electrical
Hydraulic
TV Cable
Computer 
Road

Approximation Algorithms:

Travelling Salesman Problem 
NP Hard 
List of cities and distance b/w each city
shortest path which reach each city exactly once and return to the original city

MST * 2

Stiener Tree
Used to connect vertices of subset (terminal vertices)
(A,D)

Indirect Use Of MST

Max Bottleneck problem
here we find the path b/w two designated vertices
in a weighted graph maximizing the weight of its
minimum weight edge in the path

LDPC low density parity check

Cluster Analysis

groups based on some similarities

```

# Difference between Deterministic and Non-deterministic Algorithms

```
In deterministic algorithm, for a given particular input, the computer will always produce the same output going through the same states but in case of non-deterministic algorithm, for the same input, the compiler may produce different output in different runs. In fact non-deterministic algorithms can’t solve the problem in polynomial time and can’t determine what is the next step. The non-deterministic algorithms can show different behaviors for the same input on different execution and there is a degree of randomness to it.


Problem Statement : Search an element x on A[1:n] where n>=1, on successful search return j if a[j] is equals to x otherwise return 0.

Non-deterministic Algorithm for this problem :

1.j= choice(a, n)
2.if(A[j]==x) then
    {
       write(j);
       success();
    }
3.write(0); failure();

Deterministic Algorithm
For a particular input the computer will give always same output.
	
Non-deterministic Algorithm	
For a particular input the computer will give different output on different execution.

Deterministic Algorithm
Can solve the problem in polynomial time.	

Non-deterministic Algorithm
Can’t solve the problem in polynomial time.
(exponential)

Deterministic Algorithm
Can determine the next step of execution.	

Non-deterministic Algorithm
Cannot determine the next step of execution due to more than one path the algorithm can take.

an imaginary computer called a Turing machine (TM). This machine has a finite number of states, and an infinite tape, which has discrete cells into which a finite set of symbols can be written and read. At any given time, the TM is in one of its states, and it is looking at a particular cell on the tape.

The statement P=NP means that if a problem takes polynomial time on a non-deterministic TM, then one can build a deterministic TM which would solve the same problem also in polynomial time. So far nobody has been able to show that it can be done, but nobody has been able to prove that it cannot be done, either.

NP-complete problem means an NP problem X, such that any NP problem Y can be reduced to X by a polynomial reduction. That implies that if anyone ever comes up with a polynomial-time solution to an NP-complete problem, that will also give a polynomial-time solution to any NP problem. Thus that would prove that P=NP. Conversely, if anyone were to prove that P!=NP, then we would be certain that there is no way to solve an NP problem in polynomial time on a conventional computer
```




