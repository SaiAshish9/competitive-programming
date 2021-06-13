class Main:

  @staticmethod
  def multiply(num1,num2):
    n1 = num1[::-1]
    n2 = num2[::-1]
    d = [0 for i in range(len(n1)+len(n2))]
    for i in range(len(n1)):
      for j in range(len(n2)):
        d[i+j] += int(n1[i]) * int(n2[j])
    result = ""
    for i in range(len(d)):
      digit = d[i] %  10
      carry = d[i] // 10
      if i+1 < len(d):
        d[i+1] += carry
      result = str(digit) + result
    index = 0
    while index < len(result) - 1 and result[index] == '0':
      index += 1
    return result[index:]


print(Main.multiply("7","8"))