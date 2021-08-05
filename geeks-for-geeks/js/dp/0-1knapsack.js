function max(a, b) {
  return a > b ? a : b;
}

function knapSack(W, wt, val, n) {
  if (n == 0 || W == 0) return 0;

  if (wt[n - 1] > W) return knapSack(W, wt, val, n - 1);
  else
    return max(
      val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
      knapSack(W, wt, val, n - 1)
    );
}

let val = [60, 100, 120];
let wt = [10, 20, 30];
let W = 50;
let n = val.length;

console.log(knapSack(W, wt, val, n));
