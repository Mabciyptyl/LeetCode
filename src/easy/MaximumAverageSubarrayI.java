package easy;
/**
 * ClassName: MaximumAverageSubarrayI.java
 * Author: chenyiAlone
 * Create Time: 2019/10/20 20:14
 * Description: No.643 Maximum Average Subarray I
 *
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *  
 *
 * Note:
 *
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        double ret = 0, sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        ret = sum / k;
        for (int i = 0, j = k; j < nums.length; i++, j++) {
            sum = sum - nums[i] + nums[j];
            ret = Math.max(ret, sum / k);
        }
        return ret;
    }

}