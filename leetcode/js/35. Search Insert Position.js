var searchInsert = function (nums, target) {
  return bs(nums, 0, nums.length - 1, target);
};

var bs = function (nums, start, end, target) {
  if (start > end) return end + 1;
  let mid = parseInt((start + end) / 2);
  if (nums[mid] < target) return bs(nums, mid + 1, end, target);
  else if (nums[mid] > target) return bs(nums, start, mid - 1, target);
  return mid;
};

console.log(searchInsert([2, 3, 4, 5, 6], 5));
