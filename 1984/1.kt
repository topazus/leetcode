class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()

        var m = nums.get(k - 1) - nums.get(0)
        for (i in k .. nums.size - 1) {
            m = minOf(m, nums.get(i) - nums.get(i - k + 1))
        }
        return m
    }
}