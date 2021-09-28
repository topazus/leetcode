class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val res = mutableListOf<Int>()
        for (i in 0 .. n - 1) {
            res.add(nums[i])
            res.add(nums[i + n])
        }
        return res.toIntArray()
    }
}