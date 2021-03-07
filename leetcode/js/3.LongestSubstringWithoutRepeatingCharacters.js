function convert(str) {
  var current = 0,
    st = 0,
    max = 0,
    start = 0;
  let i;
  var obj = {};
  for (i = 0; i < str.length; i++) {
    if (!obj[str[i]]) {
      obj[str[i]] = i;
    } else {
      if (obj[str[i]] >= st) {
        current = i - st;
        if (max < current) {
          max = current;
          start = st;
        }
        st = obj[str[i]] + 1;
      }
      obj[str[i]] = i;
    }
  }
  if (max < i - st) {
    max = i - st;
    start = st;
  }

  return str.substring(start, start + max);
}

const str = "abcdefhgjfghnbahggjhh";
console.log(convert(str));
