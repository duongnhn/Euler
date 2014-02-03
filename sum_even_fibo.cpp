#include <iostream>

using namespace std;

int main()
{
    long f1 = 1, f2 = 1,f3 = 0;//init
    long max = 4000000;
    long sum = 0;
    while (f3 < max)
    {
          f3 = f1+f2;
          if (f3%2==0)
             sum = sum + f3;
          // next
          f1 = f2;
          f2 = f3;
    }
    cout << sum << endl;
    getchar();
    return 0;
}
