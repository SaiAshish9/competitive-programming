public class Main {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] kmp = new int[needle.length()];
        computeKMP(needle, kmp);
        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (j == -1) {
                j = 0;
                i ++;
                continue;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == needle.length() -1) {
                    return i - needle.length() + 1;
                }
                i ++;
                j ++;
            }
            else {
                j = kmp[j];
            }
        }
        return -1;
    }
    private static void computeKMP(String s, int[] kmp){
        int prefixEnd = -1;
        int suffixEnd = 0;
        kmp[0] = -1;
        while (suffixEnd < s.length() - 1) {
            if (prefixEnd == -1 || s.charAt(prefixEnd) == s.charAt(suffixEnd)) {
                kmp[suffixEnd +1] = prefixEnd + 1;
                prefixEnd ++;
                suffixEnd ++;
            }
            else {
                prefixEnd = kmp[prefixEnd];   
            }
        }
    }
    public static void main(String ...s){
      System.out.println(strStr("hello","ll"));
    }
}