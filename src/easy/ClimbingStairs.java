package easy;
/**
 * 
 * ClassName: ClimbingStairs
 * @author chenyiAlone  
 * Create Time: 2019/04/14 11:18:17
 * Description: No.70
 * 思路:
 *     F(n) = F(n - 1) + F(n - 2);
 *     ...
 *     
 *     F(2) = F(1) + F(0);
 *     F(1) = 1;
 *     F(0) = 1;
 * 
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
    
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    
    Note: Given n will be a positive integer.
    
    Example 1:
    
    Input: 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:
    
    Input: 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i < n)
                dp[i + 1] += dp[i];
            if (i < n - 1)
                dp[i + 2] += dp[i];
        }
        return dp[n];
    }
}
