```
Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. You may assume that n > m. 
Examples: 

Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

Input:  txt[] =  "AABAACAADAABAABA"
        pat[] =  "AABA"
Output: Pattern found at index 0
        Pattern found at index 9
        Pattern found at index 12
```


```
public class NaiveSearch {

	public static void search(String txt, String pat)
	{
		int M = pat.length();
		int N = txt.length();

		for (int i = 0; i <= N - M; i++) {

			int j;
			for (j = 0; j < M; j++)
				if (txt.charAt(i + j) != pat.charAt(j))
					break;

			if (j == M) 
				System.out.println("Pattern found at index " + i);
		}
	}

	public static void main(String[] args)
	{
		String txt = "AABAACAADAABAAABAA";
		String pat = "AABA";
		search(txt, pat);
	}
}
```