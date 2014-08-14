using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Web;

namespace ProjectEulerDotNet
{
  class Program
  {
    static void Main(string[] args)
    {
      Console.WriteLine(MaximalProductWhenCuttingRope.MaximumProduct(8).Obj2.ToString());
      ServiceReference1.HelloWorldRequest ab = new ServiceReference1.HelloWorldRequest();
      Console.WriteLine(ab.ToString());
      Console.ReadKey();
    }
  }
}
