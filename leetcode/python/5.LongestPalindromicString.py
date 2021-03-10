class Main:
    lo = 0
    max_len = 0

    def extendPalindrome(self, s, j, k):
        while (j >= 0 and k < len(s) and s[j] == s[k]):
            j -= 1
            k += 1
        if self.max_len < k - j + 1:
            self.lo = j + 1
            self.max_len = k - j + 1

    def longestPalindrome(self,s):
        l = len(s)
        if l < 2:
            return s
        for i in range(0, l):
            self.extendPalindrome(s, i, i)
            self.extendPalindrome(s, i, i + 1)
            return s[self.lo, self.lo + self.max_len]
