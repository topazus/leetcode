class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var res = IntArray(nums.size)

        var j = 0
        var k = n
        for (i in 0 .. nums.size - 1) {
            if (i % 2 == 0) {
                res[i] = nums[j]
                j++
            } else {
                res[i] = nums[k]
                k++
            }
        }
        return res
    }
}