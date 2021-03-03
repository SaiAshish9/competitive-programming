def twoSum(a, b):
    x = {}
    i = 0
    while i < len(a):
        diff = b - a[i]
        if diff in x:
            return [x[diff],i]
        x[a[i]] = i
        i += 1


a = [3, 4, 5]

if __name__ == '__main__':
    print(twoSum(a, 8))

