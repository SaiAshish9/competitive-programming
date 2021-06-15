def jump(n):
    length = len(n) - 1
    curr = -1
    ans = 0
    next = 0
    i = 0
    while next < length:
        if i > curr:
            ans += 1
            curr = next
        next = max(next, n[i] + i)
        i += 1
    return ans


print(jump([2, 3, 1, 1, 4]))
