using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEulerDotNet
{
  class CheckRotatingStringBy2Places
  {
    public static Boolean InputString(String str1, String str2)
    {
      Boolean rv = false;

      if (str1.Length < 2) return rv;

      String strTemp1 = str1.Substring(0, 2);
      String strTemp2 = str1.Substring(2);

      if (str2.Equals(strTemp2 + strTemp1)) {
        rv = true;
      }

      return rv;
    }
  }
}
