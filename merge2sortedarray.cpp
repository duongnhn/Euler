//Merge 2 sorted array
#include <iostream>
#define l1 3
#define l2 3

using namespace std;

int a1 [l1] = {2, 3, 6};
int a2 [l2] = {4, 5, 7};
int l = l1+l2;
int a3 [l1+l2];//result

void printarray (int arg[], int length) {
  for (int n=0; n<length; n++)
    cout << arg[n] << " ";
  cout << "\n";
}

void merge()
{
     int i;
     int j=0,k=0;//j for a1, k for a2
     for (i=0;i<l;i++)
     {
         if (a1[j]> a2[k])
         {
            a3[i] = a2[k];
            k = k+1;
            if (k==l2) break;
         }
         else
         {
             a3[i] = a1[j];
             j = j+1;
             if (j==l1) break;
         }
     }
     int t;
     i=i+1;
     //cout << j << " " << k << " " << i << endl;
     //printarray(a3,1);
     //Copy the rest to destinated array
     if (k==l2)
     {
       for (;i<l;i++)
       {
           a3[i]=a1[j];
           j = j+1; 
       }
     }
     else
     {
       for (;i<l;i++)
       {
           a3[i]=a2[k];
           k = k+1; 
       }         
     }
     //cout << j << " " << k << " " << i << endl;
}

int main()
{
    merge();
    printarray(a3,l);
    getchar();
}
