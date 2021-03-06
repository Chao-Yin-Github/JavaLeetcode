/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 *
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (46.56%)
 * Likes:    1464
 * Dislikes: 0
 * Total Accepted:    139.4K
 * Total Submissions: 287.2K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例:
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * 
 * 进阶:
 * 
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * 
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i];
            dp[i] = Math.max(dp[i], dp[i - 1] + nums[i]);
            // 之前认为是 length -1 就是最佳的,没有 max 字段
            // 后来发现由于要求是连续的,所以不一定是 length-1 对应的 dp 的值
            // 所以需要一个字段标识从开始的每一个i位置中,最大的序列和
            max = Math.max(dp[i], max);
        }
        return max;
        // return dp[length - 1];
    }
}
// @lc code=end
