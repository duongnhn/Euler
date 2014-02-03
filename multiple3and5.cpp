#include <iostream>

using namespace std;

long mindivide(long x, long m)
{
     return x-(x%m);
}

long gcd(long x, long y)
{
     if ((x == 0) && (y==0)) return -1;
     if (x == 0) return y;
     if (y == 0) return x;
     if (x>y) return gcd(x%y,y);
     else return gcd(x,y%x);
}

int main()
{
    long n = 1000;
    long m1 = 4, m2 = 6;
    //
    long n1 = mindivide(n-1,m1);
    long n2 = mindivide(n-1,m2);
    long m3 = m1*m2/gcd(m1,m2);
    long n3 = mindivide(n-1,m3);
    //
    long sum1 = m1*(1+(n1/m1))*(n1/m1)/2;
    long sum2 = m2*(1+(n2/m2))*(n2/m2)/2;
    long sum3 = m3*(1+(n3/m3))*(n3/m3)/2;
    cout << sum1+sum2-sum3 << endl;// result
    // end
    getchar();
    return 0;
}
