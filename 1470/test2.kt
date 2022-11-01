class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val res = mutableListOf<Int>().apply {
            (0 .. n - 1).forEach {
                add(nums[it])
                add(nums[it + n])
            }
        }.toIntArray()
        return res
    }
}