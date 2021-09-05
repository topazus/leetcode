class Solution
{
public:
    int findMiddleIndex(vector<int> &nums)
    {
        int sum = 0, n = nums.size();
        for (auto v : nums)
            sum += v;

        int left = 0;
        for (int i = 0; i < n; i++)
        {
            if (i > 0)
                left += nums[i - 1];
            int right = sum - left - nums[i];
            if (left == right)
                return i;
        }
        return -1;
    }
};
