using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEulerDotNet
{
  class P21AmicableNumbers
  {
    public static Int64 SumOfDivisors(Int64 n)
    {
      if (n <= 0) return 0;
      Int64 sum = 0;
      for (Int64 i = 1; i < n; i++) {
        if (n % i == 0) {
          sum += i;
        }
      }
      return sum;
    }

    public static Int64 SumOfAmicableNumbers(Int64 n)
    {
      if (n <= 0) return 0;
      Int64 sum = 0;
      List<Int64> AmicableNumberList = new List<Int64>();
      for (Int64 a = 1; a < n; a++) {
        if (!AmicableNumberList.Contains(a)) {
          Int64 b = SumOfDivisors(a);
          if (a == b) continue;
          if (a == SumOfDivisors(b)) {
            AmicableNumberList.Add(a);
            AmicableNumberList.Add(b);
          }
        }
      }
      sum = AmicableNumberList.Sum();
      return sum;
    }
  }
}
