function min(x, y, z) {
  if (x <= y && x <= z) return x;
  if (y <= x && y <= z) return y;
  else return z;
}

function editDist(str1, str2, m, n) {
  if (m == 0) return n;

  if (n == 0) return m;

  if (str1[m - 1] == str2[n - 1]) return editDist(str1, str2, m - 1, n - 1);
  return (
    1 +
    min(
      editDist(str1, str2, m, n - 1), // Insert
      editDist(str1, str2, m - 1, n), // Remove
      editDist(str1, str2, m - 1, n - 1)
    )
  ); // Replace
}

let str1 = "sunday";
let str2 = "saturday";
console.log(str1, str2, str1.length, str2.length);
