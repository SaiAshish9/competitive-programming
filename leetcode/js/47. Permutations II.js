var permute = function (nums) {
  let res = [];
  let visited = Array(nums.length).fill(false);
  if (nums === null || nums.length === 0) {
    return res;
  }
  nums.sort();
  dfs(nums, res, [], visited);
  return res;
};

var dfs = function (nums, res = [], curr = [], visited = []) {
  if (curr.length == nums.length) {
    res.push(curr.slice());
    return;
  }
  for (let i in nums) {
    if (visited[i] === true) {
      continue;
    }
    if (
      i === 0 ||
      nums[i] !== nums[i - 1] ||
      (nums[i] === nums[i - 1] && visited[i - 1] === true)
    ) {
      visited[i] = true;
      curr.push(nums[i]);
      dfs(nums, res, curr, visited);
      curr.pop();
      visited[i] = false;
    }
  }
};

console.log(permute([1, 1, 2]));
