const x = [1, 1, 0, 1, 1, 0, 1];

var y = [];

x.forEach((a, b) => {
  if (b != 0 || b != x.length - 1)
    if (a === 0) {
      y.push(b);
    }
});

y.unshift(0);
y.push(x.length - 1);
let current = 0;
let max = 0;
let diff = 0;

for (let i = 0; i < y.length - 2; i++) {
  diff = y[i + 2] - y[i];
  if (diff > max) {
    max = diff;
    current = y[i + 1];
  }
}

if (y.length == 2 && x[x.length - 1] == 0) current = x.length - 1;

console.log(current);
