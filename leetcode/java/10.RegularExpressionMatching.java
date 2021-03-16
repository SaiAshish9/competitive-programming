// If both strings are empty, then it’s a match, thus, dp[0][0] = true.
// Let’s take an example s = "aab" and p = "c*a*b" and create a DP table.

// c	*	a	*	b
// 0	1	2	3	4	5
// 0	TRUE	FALSE	TRUE	FALSE	TRUE	FALSE
// a	1	FALSE	FALSE	FALSE	TRUE	TRUE	FALSE
// a	2	FALSE	FALSE	FALSE	FALSE	TRUE	FALSE
// b	3	FALSE	FALSE	FALSE	FALSE	FALSE	TRUE

// First column — it means p is empty and it will match to s only if s is also empty which we have stored in dp[0][0]. Thus, remaining values of dp[0][i] will be false.
// First row — this is not so easy. It means which p matches empty s. The answer is either an empty pattern or a pattern that represents an empty string such as "a*", "x*y*", "l*m*n*" and so on. In the above example, if s = "" and p = "c*", then due to *, c can be replaced by 0 cs which gives us an empty string. Hence, dp[0][2] = true.
// For non-empty strings, let’s say that s[i - 1] == p[j - 1] this means the (i - 1)th and (j - 1)th characters are same. This means, we have to check if the remaining strings are a match or not. If they are a match, then the current substrings will be a match, otherwise they won’t be a match i.e., dp[i][j] = dp[i - 1][j - 1]. We’re taking (i - 1)th and (j - 1)`th characters to offset empty strings as we’re assuming our strings start from index 1.
// If p[j - 1] == ".", then it means any single character can be matched. Therefore, here also, we will have to check if the remaining string is a match or not. Thus, dp[i][j] = dp[i - 1][j - 1].
// If p[j - 1] == "*", then it means either it’s represents an empty string (0 characters), thus dp[i][j] = dp[i][j - 2] or s[i - 1] == p[j - 2] || p[j - 2] == ".", then current character of string equals the char preceding * in pattern so the result is dp[i-1][j].

class Main {

    public static boolean isMatch(String s,String p){
      int rows = s.length();
      int columns = p.length();
      
      if(rows==0&&columns==0){
        return true;
      }
      if(columns==0){
        return false;
      }
      boolean[][] dp=new boolean[rows+1][columns+1];
      
      dp[0][0]=true;
  
      for (int i = 2; i < columns + 1; i++) {
              if (p.charAt(i - 1) == '*') {
                  dp[0][i] = dp[0][i - 2];
              }
      }
      
      for (int i = 1; i < rows + 1; i++) {
              for (int j = 1; j < columns + 1; j++) {
                  if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                      dp[i][j] = dp[i - 1][j - 1];
                  } else if (j > 1 && p.charAt(j - 1) == '*') {
                      dp[i][j] = dp[i][j - 2];
                      if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                          dp[i][j] = dp[i][j] | dp[i - 1][j];
                      }
                  }
        }
      }
          return dp[rows][columns];
  
    }
  
    public static void main(String[] args) {
      System.out.println(isMatch("aab","c*a*b"));
    }
  }