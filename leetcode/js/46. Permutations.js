var permute = function (nums) {
  let res = [];
  let visited = Array(nums.length).fill(false);
  dfs(nums, res, [], visited);
  return res;
};

var dfs = function (nums, res = [], curr = [], visited = []) {
  if (curr.length == nums.length) {
    res.push(curr.slice());
    return;
  }
  for (let i in nums) {
    if (visited[i] === false) {
      visited[i] = true;
      curr.push(nums[i]);
      dfs(nums, res, curr, visited);
      curr.pop();
      visited[i] = false;
    }
  }
};

console.log(permute([1, 2, 3]));
