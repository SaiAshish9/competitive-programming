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
arr[]    10   22  9  33  21   50  41  60
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


```
class LIS {
	static int max_ref; 

	static int _lis(int arr[], int n)
	{
		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

        return max_ending_here;
	}

	static int lis(int arr[], int n)
	{
		max_ref = 1;

		_lis(arr, n);

		return max_ref;
	}

	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n)
						+ "\n");
	}
}
```

```
class LIS {

	static int lis(int arr[], int n)
	{
		int lis[] = new int[n];
		int i, j, max = 0;

		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n)
						+ "\n");
	}
}
```