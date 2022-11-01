from typing import List


def sortedSquares(nums: List[int]) -> List[int]:
    len = len(nums)
    res = [0] * len
    start, end, k = 0, len - 1, len - 1
    while start <= end:
        start2 = nums[start] ** 2
        end2 = nums[end] ** 2
        if start2 <= end2:
            res[k] = end2
            end -= 1
        else:
            res[k] = start2
            start += 1
        k-=1
    return res
