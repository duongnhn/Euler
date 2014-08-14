using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEulerDotNet
{
  class MaximalProductWhenCuttingRope
  {
    public static Pair<Int32, Int32> MaximumProduct(Int32 n)
    {
      Int32[] MaxProduct = new Int32[n+1];
      Int32[] NumberOfElement = new Int32[n + 1];
      MaxProduct[2] = 2; NumberOfElement[2] = 1;
      MaxProduct[3] = 3; NumberOfElement[3] = 1;
      for (Int32 i = 4; i <= n; i++) {
        MaxProduct[i] = i - 1;
        NumberOfElement[i] = NumberOfElement[i - 1] + 1;
        for (Int32 j = 2; j <= i - 2; j++) {
          Int32 value = MaxProduct[i - j] * j;
          if (value > MaxProduct[i]) {
            MaxProduct[i] = value;
            NumberOfElement[i] = NumberOfElement[i - j] + 1;
          }
        }
      }
      
      return new Pair<Int32, Int32>(MaxProduct[n], NumberOfElement[n]);
    }
  }
}
