import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Main
{
	public static ArrayList<Integer>
	findSubstring(String s, String[] words)
	{
		int size_word = words[0].length();
		int word_count = words.length;
		int size_l = size_word * word_count;
		ArrayList<Integer> res = new ArrayList<Integer>();
		int n = s.length();
		if (size_l > n)
		{
			return res;
		}
		HashMap<String, Integer> hashMap =
			new HashMap<String, Integer>();

		for (String word : words)
		{
			hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
		}

		
		for (int i = 0; i <= n - size_l; i++)
		{
			HashMap<String, Integer> tempMap =
			(HashMap<String, Integer>) hashMap.clone();
			int j = i, count = word_count;
			
			while (j < i + size_l)
			{
				String word = s.substring(j, j + size_word);
				if (!hashMap.containsKey(word) || tempMap.get(word) == 0)
				{
					break;
				}
				else
				{
					tempMap.put(word, tempMap.get(word) - 1);
					count--;
				}
				j += size_word;
			}
			if (count == 0)
			{
				res.add(i);
			}

		}
		return res;
	}

	public static void main(String[] args)
	{
		String S = "barfoothefoobarman";
		ArrayList<String> L =
		new ArrayList<>(Arrays.asList("foo", "bar"));
		ArrayList<Integer> indices = findSubstring(S, L.toArray(new String[L.size()]));
		for (Integer i : indices)
		{
			System.out.println(i);
		}
	}
}
