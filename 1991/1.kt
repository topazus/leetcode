fun findMiddleIndex(nums: IntArray): Int {
    val n = nums.size
    val sum = nums.sum()

    var leftSum = 0
    for (i in 0..(n - 1)) {
        if (i > 0) leftSum += nums.get(i - 1)
        val rightSum = sum - leftSum - nums.get(i)
        if (leftSum == rightSum) return i
    }
    return -1
}