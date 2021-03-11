def convert(s, numRows):
    if numRows == 1 or len(s) < numRows:
        return s

    rows = []
    currentRow = 0
    reverse = False
    result = ""

    for i in range(0, numRows):
        rows.insert(i, [])

    for i in range(0, len(s)):
        rows[currentRow].append(s[i])

        if reverse == False:
            currentRow += 1
        else:
            currentRow -= 1

        if currentRow == numRows - 1 or currentRow == 0:
            reverse = not reverse

    for i in rows:
        result += "".join(i)

    return result


print(convert("PAYPALISHIRING", 3))
# PAHNAPLSIIGYIR