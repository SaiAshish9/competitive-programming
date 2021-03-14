class ATOI:
    @staticmethod
    def atoi(s):
        st = s.strip()

        if (st is None or len(st) == 0):
            return 0

        res = 0
        isNegative = False
        startIndex = 0

        if st[0] == '+' or st[0] == '-':
            startIndex += 1
        if st[0] == '-':
            isNegative = True

        print(startIndex, isNegative)

        i = startIndex

        while i < len(st):
            if st[i] < '0' or st[i] > '9':
                break
            digit = (int)(st[i])
            res = res * 10 + digit
            i += 1

        if isNegative:
            res = -res

        if res > 2 ^ 31 - 1:
            return 2 ^ 31

        if res < -2 ^ 31 + 1:
            return -2 ^ 31

        return res


# import sys
# sys.maxsize

print(ATOI.atoi("-23"))