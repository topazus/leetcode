class Solution {
    fun findGCD(nums: IntArray): Int {
        var numPair = (nums.max()!! to nums.min()!!)
        while (numPair.second != 0) {
            numPair = numPair.run { second to first % second }
        }
        return numPair.first
    }
}