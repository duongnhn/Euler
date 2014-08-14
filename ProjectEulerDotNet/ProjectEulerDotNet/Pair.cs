using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjectEulerDotNet
{
  public class Pair<T, U>
  {
    public T Obj1;
    public U Obj2;

    public Pair() { }
    public Pair(T _obj1, U _obj2) { Set(_obj1, _obj2); }
    public Pair(Pair<T, U> src) { CopyFrom(src); }

    public void CopyFrom(Pair<T, U> src)
    {
      if (src == null) return;

      Obj1 = src.Obj1;
      Obj2 = src.Obj2;
    }

    public void Set(T _obj1, U _obj2)
    {
      Obj1 = _obj1;
      Obj2 = _obj2;
    }
  }
}
