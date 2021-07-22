```
Given a valid sentence without any spaces between the words and a dictionary of valid English words, find all possible ways to break the sentence in individual dictionary words.

Example 

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  and, cream, icecream, man, go, mango}

Input: "ilikesamsungmobile"
Output: i like sam sung mobile
        i like samsung mobile

Input: "ilikeicecreamandmango"
Output: i like ice cream and man go
        i like ice cream and mango
        i like icecream and man go
        i like icecream and mango
```


```
import java.io.*;
import java.util.*;

class GFG {

`static void wordBreak(int n, List<String> dict, String s)
{
	String ans="";
	wordBreakUtil(n, s, dict, ans);
}

static void wordBreakUtil(int n, String s, List<String> dict, String ans)
{
	for(int i = 1; i <= n; i++)
	{

	String prefix=s.substring(0, i);
	if(dict.contains(prefix))
	{
		if(i == n)
		{

		ans += prefix;
		System.out.println(ans);
		return;
		}
		wordBreakUtil(n - i, s.substring(i,n), dict, ans+prefix+" ");
	}
	}
}

public static void main(String args[])
{
	String str1 = "iloveicecreamandmango"; // for first test case
	String str2 ="ilovesamsungmobile";	 // for second test case
	int n1 = str1.length();				 // length of first string
	int n2 = str2.length();				 // length of second string

	List <String> dict= Arrays.asList("mobile","samsung","sam","sung",
									"man","mango", "icecream","and",
									"go","i","love","ice","cream");		
	System.out.println("First Test:");

	wordBreak(n1,dict,str1);
	System.out.println("\nSecond Test:");

	wordBreak(n2,dict,str2);
}
}

```