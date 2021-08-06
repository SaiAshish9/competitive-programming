```
Basically finding all the occurences of a particular string say 'pat' in another string say 'txt' is called pattern searching

Knuth Morris Pratt Searching algorithm uses degenerating property of the pattern and improves the worst case complexity to O(n).

Degenerating property, means pattern having same sub-problems appearing more than once in the pattern , are considered

Preprocessing the pattern:

We need to preprocess a pattern string before the searching for it in the main string

Preprocessing involves constructing an lps array corresponding to the pattern string of same size as the pattern string

lps indicates longest proper prefix which is also suffix.
For e.g. proper prefixes of "ABC" are "","A","AB" and not "ABC".Sane for suffix


Preprocessing the pattern

pat[] = A B X A B

lps[] ?

lps[i] stores length of the maximum matching proper prefix which is also a suffix of the pattern pat[0,i]

pat[] A  B  X  A  B

lps[] 0  0  0     1         2
                A .. A   AB .. AB


Searching the pattern

To search for a pattern pat[] in a string txt[] we will be using 
the lps[] array we just made.

We use a value from lps[] to decide the next characters to be matched

The idea is to not match character that we know will anyway match
```


```
class KMP_String_Matching {
	void KMPSearch(String pat, String txt)
	{
		int M = pat.length();
		int N = txt.length();
		int lps[] = new int[M];
		int j = 0; 
		computeLPSArray(pat, M, lps);
		int i = 0;
		while (i < N) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				System.out.println("Found pattern "
								+ "at index " + (i - j));
				j = lps[j - 1];
			}
			else if (i < N && pat.charAt(j) != txt.charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
	}

	void computeLPSArray(String pat, int M, int lps[])
	{
		int len = 0;
		int i = 1;
		lps[0] = 0; 
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else 
			{
				if (len != 0) {
					len = lps[len - 1];
				}
				else 
				{
					lps[i] = len;
					i++;
				}
			}
		}
	}

	public static void main(String args[])
	{
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		new KMP_String_Matching().KMPSearch(pat, txt);
	}
}
```

```
j             i   
a b c d a b c a
0 0 0 0 1 2 3 1
```

```
https://www.youtube.com/watch?v=GTJr8OvyEVQ
```