function lcs(X, Y, m, n) {
  if (m === 0 || n === 0) {
    return 0;
  } else if (X[m - 1] === Y[n - 1]) {
    return 1 + lcs(X, Y, m - 1, n - 1);
  } else {
    return Math.max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
  }
}

const X = "AGGTAB";
const Y = "GXTXAYB";
console.log(lcs(X, Y, X.length, Y.length));
