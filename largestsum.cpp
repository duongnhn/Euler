#include <iostream>
#include <fstream>
#include <string>

#define max 50

using namespace std;

int f[max+2];//result
int r[max+2];//remember
int a[max];

void convert(char c[max])
{
  //int a[max];
  for (int i=0;i<=max-1;i++)
    a[i]=(c[max-i-1]-'0');
  //return a;
}

void init()
{
  for (int i=0;i<max;i++)
  {
    f[i] = 0;
    r[i] = 0;
    a[i] = 0;
  }
  f[max] = 0;f[max+1] = 0;
  r[max] = 0;r[max+1] = 0;
}

void addarray()
{
  for (int i=0;i<=max-1;i++)
  {
    f[i]=f[i]+a[i]+r[i];
    r[i+1]=r[i+1]+(int)(f[i]/10);
    f[i]=f[i]%10;
    r[i]=0;
  }
  f[max] = f[max]+r[max];
  r[max] = 0;
  f[max+1] = f[max+1]+(int)(f[max]/10);
  f[max] = f[max]%10;
}

void printarray(int * x)
{ 
  ofstream outfile("largesumout.txt");
  for (int i=max+1;i>=0;i--)
  {
    cout << x[i];
    outfile << x[i];
  }
  outfile.close();
}

void readfile()
{
  ifstream myfile("largesum.txt");
  char c[max];
  if (myfile.is_open())
  {
    while (myfile >> c)
    {
      cout << c << endl;
      //
      convert(c);
      //printarray(a);
      //cout << endl;
      addarray();
      //cout << c << endl; 
    }
    myfile.close();
  }
}

int main()
{
  init();
  readfile();
  printarray(f);
  getchar();
  return 0;
}
