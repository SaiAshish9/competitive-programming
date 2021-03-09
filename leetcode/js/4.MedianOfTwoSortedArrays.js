const arr1 = [1, 4];
const arr2 = [2, 5];
const list = [...arr1, ...arr2];
list.sort();

var median;
var mid;

mid = parseInt(list.length / 2);

if (list.length % 2 != 0) {
  median = list[mid];
} else {
  median = (list[mid - 1] + list[mid]) / 2;
}

console.log(median);
