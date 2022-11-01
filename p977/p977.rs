// /home/ruby/Documents/rust-learn/leetcode/p1855Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
pub fn sorted_squares2(nums: Vec<i32>) -> Vec<i32> {
    let len = nums.len();
    let (mut start, mut end, mut k) = (0, len - 1, len - 1);
    let mut ans = vec![0; len];
    while start <= end {
        let start2 = nums[start] * nums[start];
        let end2 = nums[end] * nums[end];
        if start2 < end2 {
            ans[k] = end2;
            end -= 1;
        } else {
            ans[k] = start2;
            start += 1;
        }
        k -= 1;
    }
    ans
}
