```

Block:   A        B          C

Weight  10       20         30

Value:  60      100         120

Capacity -> 50

0-1 Knapsack           Fractional Knapsack


B and C                A + B + (2/3 * C)                           
20 + 30                10+20+30*2/3   
220                    240
```

# Greedy Approach:

```
1. Calculate the ratio(value/weight) for each item

2. Sort the items based on this ratio
(desc)

3. Take the item with highest ratio and add them
until we can't add the next item as whole.

4. At the end add the next item as much(fraction) as we can.

```

```
A brute-force solution would be to try all possible subset with all different fraction but that will be too much time taking. 

An efficient solution is to use Greedy approach.
```