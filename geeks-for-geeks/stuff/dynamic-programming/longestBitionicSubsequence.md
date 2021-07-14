# Longest Bitonic Subsequence

```
Given an array[0..n-1] containing n positive integers, a subsequence 
of arr[] is called Bitonic if it is first increasing, then decreasing.

{1,11,2,10,4,5,2,1}

Longest Bitonic Subsequence of length 6 : 1 , 2, 10 , 4 , 2 ,1 
```

# lis & lds

```
for (i = n-2; i >= 0; i--)
    for (j = n-1; j > i; j--)
        if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
            lds[i] = lds[j] + 1;

{ 1,11,2,10,4,5,2,1 }

First we initialize all elements of lis[] & lds[] with 1

lis[]

0     1      2     3    4    5    6    7
1     2      2     3    3    4    2    1



lds[]

0    1      2     3    4    5    6    7
1    1      1     1    1    1    1    1

1    11     2     10   4    5    2    1  arr[]
```


```
subsequence problem */
import java.util.*;
import java.lang.*;
import java.io.*;

class LBS
{
	arr[] of size n. The function mainly creates two temporary arrays
	lis[] and lds[] and returns the maximum lis[i] + lds[i] - 1.

	lis[i] ==> Longest Increasing subsequence ending with arr[i]
	lds[i] ==> Longest decreasing subsequence starting with arr[i]
	*/
	static int lbs( int arr[], int n )
	{
		int i, j;
		int[] lis = new int[n];
		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

			all indexes */
		int[] lds = new int [n];
		for (i = 0; i < n; i++)
			lds[i] = 1;

		for (i = n-2; i >= 0; i--)
			for (j = n-1; j > i; j--)
				if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
					lds[i] = lds[j] + 1;


		int max = lis[0] + lds[0] - 1;
		for (i = 1; i < n; i++)
			if (lis[i] + lds[i] - 1 > max)
				max = lis[i] + lds[i] - 1;

		return max;
	}

	public static void main (String[] args)
	{
		int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
					13, 3, 11, 7, 15};
		int n = arr.length;
		System.out.println("Length of LBS is "+ lbs( arr, n ));
	}
}

```