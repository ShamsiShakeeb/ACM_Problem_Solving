using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProblemSolvingJourney.LeetCode.DynamicProgramming
{
    public class ClimbingStairs
    {
        Dictionary<int, int> memo = new Dictionary<int, int>();
        public int ClimbStairs(int n)
        {
            if (n == 0)
                return 1;
            else if (n < 0)
                return 0;
            int ival;
            var IsExist = memo.TryGetValue(n, out ival);
            if (IsExist)
                return ival;
            memo[n] = ClimbStairs(n - 1) + ClimbStairs(n - 2);
            return memo[n];
        }
	public int ClimbStairsTabulization(int n)
        {
            if (n == 0 || n == 1)
                return 1;

            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i <= n; i++)
            {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }
}
