class Main {
  static multiply(num1, num2) {
    let n1 = num1.split("").reverse().join("");
    let n2 = num2.split("").reverse().join("");
    var d = Array(n1.length + n2.length).fill(0);
    for (let i = 0; i < n1.length; i++) {
      for (let j = 0; j < n2.length; j++) {
        d[i + j] += (n1[i] - "0") * (n2[j] - "0");
      }
    }
    let result = "";
    for (let i = 0; i < d.length; i++) {
      let digit = d[i] % 10;
      let carry = parseInt(d[i] / 10);
      if (i + 1 < d.length) {
        d[i + 1] += carry;
      }
      result = digit + "" + result;
    }
    let index = 0;
    while (index < result.length - 1 && result[index] == "0") {
      index++;
    }
    return result.substr(index);
  }
}

console.log(Main.multiply("7", "8"));
