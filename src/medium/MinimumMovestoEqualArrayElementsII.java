package medium;

import java.util.Arrays;
/**
 * ClassName: MinimumMovestoEqualArrayElementsII.java
 * Author: chenyiAlone
 * Create Time: 2019/9/18 21:26
 * Description: No.462 Minimum Moves to Equal Array Elements II
 * 思路:
 *       所有的数都逼近中位数
 *
 * Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
 *
 * You may assume the array's length is at most 10,000.
 *
 * Example:
 *
 * Input:
 * [1,2,3]
 *
 * Output:
 * 2
 *
 * Explanation:
 * Only two moves are needed (remember each move increments or decrements one element):
 *
 * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
 *
 */
public class MinimumMovestoEqualArrayElementsII {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        int mid = nums[nums.length / 2];
        for (int i : nums) {
            ret += Math.abs(i - mid);
        }
        return ret;
    }
}