#include <iostream>
#include <math.h>

using namespace std;

long gcd(long x,long y)
{
  if (x == 0) return y;
  if (y == 0) return x;
  if (x > y) return gcd(x%y,y);
  else return gcd(x,y%x);
}

long lcm(long x,long y)
{
  return (x/gcd(x,y)*y);
}

long smallestMultiple(int n)
{
  long r = 1;
  for (long i=2;i<=n;i++)
  {
    r = lcm(r,i);
  }
  return r;
}

bool isprime (unsigned long long i)
{
    if(i==1||i==0) return false;
    if(i==2) return true;
    for(unsigned long long k=2;k<=sqrt(i);k++)
    {      
        if(i%k==0) return false;
    }
    return true;
}


int main()
{
  long long x = 600851475143LL;
  /*
  long squaresum = (100*101/2);
  long sumsquare = 1;
  cout << squaresum*squaresum-sumsquare << endl;
  */
  long long k=(long long) (sqrt(x));
  for (;k>2;k--)
    if ((x%k==0)&&(isprime(k)))
      break;
  cout << k << endl;
  getchar();
  return 0;
}

