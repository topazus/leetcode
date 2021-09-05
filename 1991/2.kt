fun findMiddleIndex(nums: IntArray): Int {
        val len = nums.size

        for (i in 0..(len - 1)) {
            val leftSum = nums.slice(0 .. i - 1).sum()
            val rightSum = nums.slice(i + 1 .. len - 1).sum()
            if (leftSum == rightSum) return i
        }
        return -1
    }