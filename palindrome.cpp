#include <iostream>
#include <math.h>

using namespace std;

bool checkpalindrome(long x)
{
  int * a = new int[10];
  int l = 0;
  if ((0<=x)&(x<=9))
    return true;
  while (x>0)
  {
    a[l] = x%10;
    x = (long)(x/10);
    l++;
  }
  for (int i=0;i<=l/2;i++)
  {
    if (a[i]!=a[l-i-1])
      return false;
  }
  delete(a);
  return true;
}

long findmax()
{
  long m,n;
  for (m = 999*999;m>100*100;m--)
    if (checkpalindrome(m))
      for (n = round(sqrt(m));n>99;n--)
        if ((m%n==0)&(m/n)<1000)
        {
          cout << n << endl;
          return m;
        }
}

int main()
{
//  cout << checkpalindrome(121121) << endl;
  cout << findmax() << endl;
  getchar();
  return 0;
}
