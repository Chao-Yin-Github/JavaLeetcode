/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 * 
 * started at 2020-03-22 09:26:17
 * 
 * finished at 2020-03-22 09:36:13
 *
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * algorithms
 * Easy (53.02%)
 * Likes:    259
 * Dislikes: 0
 * Total Accepted:    76.1K
 * Total Submissions: 143.6K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * 说明:
 * 
 * 
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 
 * 
 * 示例:
 * 
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * 
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int length = numbers.length;
        int right = length - 1;
        while (left < right) {
            if (numbers[left] > target) {
                break;
            }
            if (numbers[left] + numbers[right] == target) {
                return new int[] { left + 1, right + 1 };
            }
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }
}
// @lc code=end
