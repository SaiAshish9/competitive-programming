function rotate(arr) {
  const n = arr.length;
  for (let i = 0; i < n / 2; i++) {
    for (let j = 0; j < Math.ceil(n / 2); j++) {
      let temp = arr[i][j];
      arr[i][j] = arr[n - 1 - j][i];
      arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
      arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
      arr[j][n - 1 - i] = temp;
    }
  }
}

const arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

console.log(arr);
console.log("#############");
rotate(arr);
console.log(arr);
