#include <vector>

std::vector<int> sortedSquares2(std::vector<int> &nums) {
  int len = nums.size();
  int start = 0;
  int end = len - 1;
  int k = len - 1;
  auto res = std::vector<int>(len, 0);
  while (start <= end) {
    if (nums[start] * nums[start] <= nums[end] * nums[end]) {
      res[k] = nums[end] * nums[end];
      end--;
    } else {
      res[k] = nums[start] * nums[start];
      start++;
    }
    k--;
  }
  return res;
}