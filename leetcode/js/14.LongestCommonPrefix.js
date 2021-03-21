class Solution {
  static lcp(s) {
    if (s.length == 0) {
      return "";
    }
    var prefix = s[0];
    for (let i = 0; i < s.length; i++) {
      for (let j = 0; j < prefix.length; j++) {
        if (j == s[i].length || prefix[j] != s[i][j]) {
          prefix = prefix.substr(0, j);
          break;
        }
      }
    }
    return prefix;
  }
}

console.log(Solution.lcp(["flower", "flow", "flight"]));
