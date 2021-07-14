```
Given an array of n positive integers, find the sum of maximum sum subsequence such that the integers in the subsequence are sorted in increasing order.

Input : {1,101,2,3,100,4,5}
Output : 106 (1+2+3+100)

Input : {10,5,4,3}
Output : 10

variation of lis

```

```
class GFG
{
	static int maxSumIS(int arr[], int n)
	{
		int i, j, max = 0;
		int msis[] = new int[n];

		for (i = 0; i < n; i++)
			msis[i] = arr[i];

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] &&
					msis[i] < msis[j] + arr[i])
					msis[i] = msis[j] + arr[i];

		for (i = 0; i < n; i++)
			if (max < msis[i])
				max = msis[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
		int n = arr.length;
		System.out.println("Sum of maximum sum "+
							"increasing subsequence is "+
							maxSumIS(arr, n));
	}
}
```