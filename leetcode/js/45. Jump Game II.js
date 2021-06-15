var jump = function (n) {
  let len = n.length - 1;
  let curr = -1,
    next = 0,
    ans = 0;
  for (let i = 0; next < len; i++) {
    if (i > curr) {
      ans++;
      curr = next;
    }
    next = Math.max(next, n[i] + i);
  }
  return ans;
};

console.log(jump([2, 3, 1, 1, 4]));
