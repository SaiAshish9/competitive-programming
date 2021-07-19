```
Pattern Search

Text : "G  E  E  K  S  F  O  R  G  E   E   K   S" N
        0  1  2  3  4  5  6  7  8  9  10   11  12 M


Pattern: "G E E K"

N > M

hash("GEEk") = x

we'll generate a window with width x and for all possible windows
we'll then compare the letters present inside the window

Since we need to efficiently calculate hash values for all the substrings of size m of text, we must have a hash function which has the following property. 
Hash at the next shift must be efficiently computable from the current hash value and next character in text or we can say hash(txt[s+1 .. s+m]) must be efficiently computable from hash(txt[s .. s+m-1]) and txt[s+m] i.e., hash(txt[s+1 .. s+m])= rehash(txt[s+m], hash(txt[s .. s+m-1])) and rehash must be O(1) operation.
```

```

public class Main
{
	public final static int d = 256;
	
	/* pat -> pattern
		txt -> text
		q -> A prime number
	*/
	static void search(String pat, String txt, int q)
	{
		int M = pat.length();
		int N = txt.length();
		int i, j;
		int p = 0; 
		int t = 0; 
		int h = 1;
	
		for (i = 0; i < M-1; i++)
			h = (h*d)%q;
		for (i = 0; i < M; i++)
		{
			p = (d*p + pat.charAt(i))%q;
			t = (d*t + txt.charAt(i))%q;
		}
	

		for (i = 0; i <= N - M; i++)
		{
			if ( p == t )
			{
				for (j = 0; j < M; j++)
				{
					if (txt.charAt(i+j) != pat.charAt(j))
						break;
				}
				if (j == M)
					System.out.println("Pattern found at index " + i);
			}
			if ( i < N-M )
			{
				t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
				if (t < 0)
				t = (
                    t + q);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String txt = "GEEKS FOR GEEKS";
		String pat = "GEEK";
        int q = 101;
		search(pat, txt, q);
	}
}

```