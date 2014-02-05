#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int n = 20;
int **a;
int col,row;
long max1;

void init()
{
  a = new int* [n]; 
  int i = 0;
  for (;i<n;i++)
  {
    a[i] = new int[n];
  }
}

void readfile()
{
  //READ file
  ifstream myfile("textinput.txt");
  int j = 0;
  int i = 0;
  int x;
  if (myfile.is_open())
  {
    while (myfile >> x)
    {
      a[i][j] = x;
      j++;
      if (j == n)
      {
        j = 0;
        i++;
      }
    }
    myfile.close();
  }
}

void findgreat()
{
  int d = 4;
  int i,j,t;
  max1 = 0;
  for (i=0;i<n;i++)
  {
    for (j=0;j<n;j++)
    {
      long right = 1,down = 1,diag = 1,diag1 = 1;
      if (i+d-1<n) //down 
      {
         for (t=i;t<=i+d-1;t++)
         {
           down = down*a[t][j];
         }
         if (down > max1)
         {
           max1 = down;
           col = j;
           row = i;
         }
      }
      if (j+d-1<n) //right
      {
         for (t=j;t<=j+d-1;t++)
         {
           right = right*a[i][t];
         }
         if (right > max1)
         {
           max1 = right;
           col = j;
           row = i;
         }
      }
      if ((j+d-1<n)&(i+d-1<n)) //diag
      {
         for (t=0;t<=d-1;t++)
         {
           diag = diag*a[i+t][j+t];
         }
         if (diag > max1)
         {
           max1 = diag;
           col = j;
           row = i;
         }
      }
      if ((j+d-1<n)&(i>=d-1)) //diag1
      {
         for (t=0;t<=d-1;t++)
         {
           diag1 = diag1*a[i-t][j+t];
         }
         if (diag1 > max1)
         {
           max1 = diag1;
           col = j;
           row = i;
         }
      }
    }
  }  
  // return max;
}

void print()
{
  int i, j;
  for (i=0;i<n;i++)
  {
    for (j=0;j<n;j++)
    {
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
}

int main()
{
  init();
  readfile();
  print();
  findgreat();
  cout << max1 << " " << row << " " << col << endl;
  cout << a[row][col];
  // 
  delete(a);
  getchar();
  return 0;
}
