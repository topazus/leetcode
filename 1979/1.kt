class Solution {
    fun findGCD(nums: IntArray): Int {
        // var a = nums.min()!!
        // var b = nums.max()!!
        nums.sort()
        var a = nums.first()
        var b = nums.last()

        while (b != 0) {
            val t = b
            b = a % b
            a = t
        }
        return a
    }
}