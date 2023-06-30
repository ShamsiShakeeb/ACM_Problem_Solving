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
    }
}
