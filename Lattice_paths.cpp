#include <iostream>

using namespace std;

int main()
{
    int n = 20;
    long long m1=1,m2=1;//result
    int i;
    for (i = n+1;i <= 2*n;i++)
    {
      m1 = m1*i;
      m1 = (long long)(m1/(i-n));
    }
    cout << (m1/m2) << endl;
    getchar();
    return 0;
}
