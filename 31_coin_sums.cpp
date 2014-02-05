//Problem 31 (Euler) - Coin sums
#include <iostream>

#define N 200
#define M 8

using namespace std;

int main()
{
  int s[N+1][M+1];
  int v[M+1]={0,1,2,5,10,20,50,100,200};
  // Initilize
  for (int i=0;i<=N;i++)
    s[i][1]=1;
  for (int j=0;j<=M;j++)
    s[0][j]=1;
  // Optimize for dynamic programming
  for (int i=1;i<=N;i++)
    for (int j=2;j<=M;j++)
    {
      s[i][j] = s[i][j-1];
      int k = (int)(i/v[j]);
      for (int l=1;l<=k;l++)
        s[i][j] = s[i][j]+s[i-l*v[j]][j-1]; 
    }

  cout << s[N][M] << endl;
  getchar();
  return 0;
}//end
