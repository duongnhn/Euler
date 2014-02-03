#include <iostream>
#include <math.h> 

using namespace std;

int checkPrime(long x)
{
     long i;
     //bool check = false;
     for (i=2;i<=round(sqrt(x));i++)
     {
         if ((x%i)==0)
         {
            return 0;
         }
     }
     return 1;
}

int main() 
{
    //cout << checkPrime(12) << endl;
    int max = 9999;
    long result = 3;
    for (;max>0;max--)
    {
        do
        {
          result = result + 2;
        }while (checkPrime(result)==0);        
        cout << result << endl;        
    }
    getchar();
    return 0;
}
